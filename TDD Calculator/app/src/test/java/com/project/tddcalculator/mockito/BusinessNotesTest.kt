package com.project.tddcalculator.mockito

import com.project.tddcalculator.unittesting.NoteTakingManager
import com.project.tddcalculator.unittesting.NoteTakingService
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class BusinessNotesTest {

    @Test
    fun testRetrieveBusinessNotes() {
        val service: NoteTakingService = NoteTakingStubService()
        val manager = NoteTakingManager(service)
        assertEquals(2, manager.getAllBusinessNotes().size)
    }

    @Test
    fun testRetrieveBusinessNotesWithMockito(){
        val service: NoteTakingService = mock(NoteTakingService::class.java)

        // Return Fake that when getAllBusinessNotes() is called
        val data = arrayListOf("Android market", "Android Developer", "Learn Programming")
        `when`(service.getAllBusinessNotes()).thenReturn(data)


        val manager = NoteTakingManager(service)
        assertEquals(2, manager.getAllBusinessNotes().size)
    }
}