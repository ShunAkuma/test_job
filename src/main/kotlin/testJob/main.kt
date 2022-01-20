package testJob

import testJob.MainModule.CSVPrinter
import testJob.MainModule.Reciever


fun main(){
    val csv = CSVPrinter()
    val string : String = (",T1009")
    val array: Array<String> = arrayOf("T1004, ,T1008, T1007,","T1003, ,T1001, ,","T1009, ,T1005","T1009, , ,T111, T12292",",,,T1009,,,,,","T10002,,T1100,22102012, T1009")
    csv.printToCsv(Reciever.staticMethod(string, array))

}