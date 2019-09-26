package com.project.tddcalculator.mockito

import com.project.tddcalculator.unittesting.NoteTakingManager
import com.project.tddcalculator.unittesting.NoteTakingService
import junit.framework.Assert.assertEquals
import org.junit.Test

class BusinessNotesTest {

    @Test
    fun testRetrieveBusinessNotes() {
        val service: NoteTakingService = NoteTakingStubService()
        val manager = NoteTakingManager(service)
        assertEquals(2, manager.getAllBusinessNotes().size)
    }
}