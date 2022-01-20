package testJob.MainModule


import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

import kotlin.test.assertEquals

internal class ReciverTest {
    val reciver = Reciever()
    @DisplayName("Test converter method")
    @Test
    fun converterStringToArrayList() {
        val str = "T1001,, T1002, T1003 T22022 T22022 , , , , T1111,, ,, , T11"
        val list = arrayListOf<String>("T1001","T1002","T1003","T22022","T22022","T1111","T11")
        assertEquals(expected = list, actual = reciver.converterStringToArrayList(str))


    }
    @DisplayName("Creating final array")
    @Test
    fun creatingFinalArray() {
        val list = arrayListOf<String>("T1001")
        val array: Array<String> = arrayOf("T1004, ,T1006, T1007,","T1006, ,T1001, ,","T1009, ,T1005","T1001, , , T0002,T3002")
        val expectedList = arrayListOf<String>("T1006, ,T1001, ,","T1001, , , T0002,T3002")
        assertEquals(expected = expectedList, reciver.creatingFinalArray(list,array))
    }
}