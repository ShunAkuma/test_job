package testJob

import testJob.Reciever.CSVPrinter
import testJob.Reciever.Reciever

fun main(){
    val csv = CSVPrinter()
    val string : String = (",T1006")
    val array: Array<String> = arrayOf("T1004, ,T1006, T1007,","T1006, ,T1001, ,","T1009, ,T1005")

    csv.printToCsv(Reciever.staticMethod(string, array))


}