package testJob

import testJob.reciever.Reciver

fun main(){
//    count id range (1-3)
    val string : String = ("T1004, , T1005,,,,    Y1002")
    val array: Array<String> = arrayOf("T1005, ,T1004", "T1008, ,T1004,,T1005","T1009, ,T1005")

    println(string.length)
    val a = Reciver()
    println(a.findAllMatchInArray(string))


    println(Reciver.test(string, array))

}