package testJob.Reciever

class Reciever() {

    companion object{
        fun staticMethod(string : String, array : Array<String> ):ArrayList<String>{
            var finalList:ArrayList<String>
            val reciver = Reciever()
            finalList = reciver.creatingFinalArray(reciver.converterStringToArrayList(string),array)
            finalList = reciver.converterStringToArrayList(list = finalList)

            return finalList
        }
    }

    fun converterStringToArrayList(string: String = "", list:ArrayList<String> = arrayListOf<String>()) : ArrayList<String>{
        val arrayList: ArrayList<String> = arrayListOf()
        var str = string

        var startIndex = -1
        var endIndex = -1
        var listSize = str.length - 1
        if(list.isNotEmpty()){
            str = list.joinToString()
            listSize = str.length
        }
        str.forEachIndexed{ _index, _element ->
            if (_element.toLowerCase().toString() in "a" .. "z" ){
                startIndex = _index
            }
            if ((startIndex != -1) && (_element == ',' || _element == ' ') || listSize == _index){
                endIndex = _index
                if (listSize == _index){
                    endIndex+=1
                }

                val temp = str.substring(startIndex, endIndex)
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
