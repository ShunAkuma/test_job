package testJob

import testJob.reciever.CSVPrinter
import testJob.reciever.Reciver

fun main(){
    val csv = CSVPrinter()
    val string : String = (",T1006")
    val array: Array<String> = arrayOf("T1004, ,T1006, T1007,","T1006, ,T1001, ,","T1009, ,T1005")

    csv.printToCsv(Reciver.staticMethod(string, array))


}