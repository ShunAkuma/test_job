package testJob.MainModule

class Reciever() {

    companion object{
        fun staticMethod(string : String, array : Array<String> ):ArrayList<String>{
            val reciver = Reciever()
            return reciver.creatingFinalArray(reciver.converterStringToArrayList(string),array)
        }
    }

    fun converterStringToArrayList(string: String) : ArrayList<String>{
        val arrayList: ArrayList<String> = arrayListOf()
        var startIndex = -1
        var endIndex = -1
        val listSize = string.length - 1

        string.forEachIndexed{ _index, _element ->
            if (_element.toLowerCase().toString() in "a" .. "z" ){
                startIndex = _index
            }
            if ((startIndex != -1) && (_element == ',' || _element == ' ') || listSize == _index){
                endIndex = _index
                if (listSize == _index){
                    endIndex+=1
                }

                val temp = string.substring(startIndex, endIndex)
                arrayList.add(temp)

                startIndex = -1
                endIndex = -1
            }
        }
        return arrayList
    }

    fun creatingFinalArray(list: ArrayList<String>, array:Array<String>) : ArrayList<String>{
        val finalList: ArrayList<String> = arrayListOf()
        for(item in array){
            if(list.all { it in item }){
                finalList.add(item)
            }
        }
        return finalList
    }
}
