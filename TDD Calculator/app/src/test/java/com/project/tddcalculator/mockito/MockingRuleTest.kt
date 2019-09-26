package com.project.tddcalculator.mockito

import org.junit.Rule
import org.mockito.Mock
import org.mockito.junit.MockitoJUnit
import org.mockito.junit.MockitoRule


class MockingRuleTest {

    @Rule
    var rule: MockitoRule = MockitoJUnit.rule()

    @Mock
    lateinit var person: Person
}