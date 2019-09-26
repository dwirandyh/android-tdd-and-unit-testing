package com.project.tddcalculator.mockito

import org.junit.Before
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class AnnotationMockingTest {

    @Mock
    lateinit var person: Person

    @Before
    fun setup(){
        MockitoAnnotations.initMocks(this)
    }
}