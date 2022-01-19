package testJob

import testJob.reciever.Reciver

fun main(){
//    count id range (1-3)
    val string : String = (",T1006")
    val array: Array<String> = arrayOf("T1004, ,T1006, T1007,","T1006, ,T1001, ,","T1009, ,T1005")

    Reciver.test(string, array)


}