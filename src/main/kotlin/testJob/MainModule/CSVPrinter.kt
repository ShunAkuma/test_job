package testJob.MainModule
import java.io.File
import java.io.PrintWriter


class CSVPrinter {
    private val csvFile = File("outputFile.csv")
    private val out = PrintWriter(csvFile)

    fun printToCsv(list: ArrayList<String>){
        list.forEach {
            out.println(it)
        }
        out.close()
    }
}