package testJob

import testJob.reciever.Reciver

fun main(){
//    count id range (1-3)
    val string : String = ("T1004, , T1005")
    val array: Array<String> = arrayOf("T1005, ,T1004", "T1008, ,T1004,,T1005","T1009, ,T1005")

    println(Reciver.test(string, array))

}