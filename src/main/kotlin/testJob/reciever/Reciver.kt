package testJob.reciever

class Reciver() {

    companion object{
        @JvmStatic
        fun test(string : String, array : Array<String> ):ArrayList<String>{
            var tempList: ArrayList<String>
            val finalList:ArrayList<String>
            val reciver = Reciver()
            val csv = CSVPrinter()
            tempList = reciver.creatingFinalArray(reciver.converterStringToArrayList(string),array)

            finalList = reciver.converterStringToArrayList(list = tempList)
            csv.printToCsv(finalList)
            println(finalList)

            return arrayListOf()
        }
    }

    fun converterStringToArrayList(string: String = "", list:ArrayList<String> = arrayListOf<String>()) : ArrayList<String>{
        val arrayL: ArrayList<String> = arrayListOf()
        var string = string

        var startIndex = -1
        var endIndex = -1
        var listSize = string.length - 1
        if(list.isNotEmpty()){
            string = list.joinToString()
            listSize = string.length
        }
        string.forEachIndexed{_index, _element ->
            if (_element.toLowerCase().toString() in "a" .. "z" ){
                startIndex = _index
            }
            if ((startIndex != -1) && (_element.equals(',') || _element.equals(' ')) || listSize == _index){
                endIndex = _index
                if (listSize == _index){
                    endIndex+=1
                }

                val temp = string.substring(startIndex, endIndex)
                arrayL.add(temp)

                startIndex = -1
                endIndex = -1
            }
        }
        return arrayL
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
