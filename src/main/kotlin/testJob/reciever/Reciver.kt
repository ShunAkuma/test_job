package testJob.reciever

class Reciver() {

    companion object{
        @JvmStatic
        fun test(string : String, array : Array<String> ):ArrayList<String>{




            return arrayListOf()
//            return listOf("hello") as ArrayList<String>
//            Cast array to ArrayList<String>
//            val list: ArrayList<String> = array.toCollection(ArrayList())
        }
    }

    fun converterStringToArrayList(string: String) : ArrayList<String>{
        val arrayL: ArrayList<String> = arrayListOf()
        var startIndex = -1
        var endIndex = -1
        val listSize = string.length - 1
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

        list.forEach {
            if(it in array[0]) {
                
            }
        }

        return finalList
    }
}


//Сатичный метод (строку и массив строк): ArrayList<>
//