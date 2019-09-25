package com.project.tddcalculator.rule

import org.junit.Rule
import org.junit.Test
import org.junit.rules.Timeout
import java.lang.Exception

class FirstRuleTest {

    //Predifined Rules
    @Rule
    @JvmField
    val timeout: Timeout = Timeout(2000)

    @Test
    @Throws(Exception::class)
    fun testA() {

    }

    @Test
    @Throws(Exception::class)
    fun testB(){

    }

    @Test
    @Throws(Exception::class)
    fun testC(){

    }
}
