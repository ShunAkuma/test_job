package testJob.reciever
import java.io.File
import java.io.PrintWriter


class CSVPrinter {
    val csvFile = File("outputFile.csv")
    val out = PrintWriter(csvFile)

    fun printToCsv(list: ArrayList<String>){
        list.forEach {
            out.println("Value : $it")
        }
        out.close()
    }
}