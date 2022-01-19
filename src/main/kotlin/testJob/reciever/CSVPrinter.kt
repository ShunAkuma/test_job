package testJob.reciever

import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVPrinter
import java.io.BufferedWriter
import java.io.File
import java.io.PrintWriter
import java.nio.file.Paths
import java.nio.file.Paths.*


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