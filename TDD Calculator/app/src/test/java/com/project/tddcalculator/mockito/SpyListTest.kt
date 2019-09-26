package com.project.tddcalculator.mockito

import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class SpyListTest {

    @Test
    fun testSpyArrayList(){
        val originalList: ArrayList<String> = ArrayList()
        val spyList: ArrayList<String>  = Mockito.spy(originalList)

        spyList.add("Python Programming")
        spyList.add("Kotlin Programming")

        Mockito.verify(spyList).add("Python Programming")
        Mockito.verify(spyList).add("Kotlin Programming")

        assertEquals(2, spyList.size)
    }


    /**
     * This method will fail because Mockito.mock not create real object,
     * so when mockito.verify cannot verify value that has added
     */
    @Test
    fun testMockArrayList(){
        val mockList: ArrayList<String> = Mockito.mock(arrayListOf<String>()::class.java)

        mockList.add("Python Programming")
        mockList.add("Kotlin Programming")

        Mockito.verify(mockList).add("Python Programming")
        Mockito.verify(mockList).add("Kotlin Programming")

        assertEquals(2, mockList.size)
    }
}