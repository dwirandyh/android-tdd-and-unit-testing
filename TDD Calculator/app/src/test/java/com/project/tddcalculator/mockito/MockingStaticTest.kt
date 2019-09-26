package com.project.tddcalculator.mockito

import org.junit.Test
import org.mockito.Mockito.mock

class MockingStaticTest {

    @Test
    fun testPerson(){
        val person: Person = mock(Person::class.java)
    }
}