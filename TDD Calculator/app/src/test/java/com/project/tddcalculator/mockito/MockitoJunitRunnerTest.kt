package com.project.tddcalculator.mockito

import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MockitoJunitRunnerTest{

    @Mock
    lateinit var person: Person
}