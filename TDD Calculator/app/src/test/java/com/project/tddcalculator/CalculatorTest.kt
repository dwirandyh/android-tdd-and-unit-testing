package com.project.tddcalculator

import junit.framework.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test
import java.lang.IllegalArgumentException

class CalculatorTest {

    @Test
    fun testAddingTwoPositiveNumbers(){
        val calculator = Calculator()
        val result: Int = calculator.add(20, 50)
        assertEquals(70, result)
    }

    @Test
    fun testSubtractionPositiveNumbers(){
        val calculator = Calculator()
        val result: Int = calculator.subtraction(2, 10)
        assertEquals(20, result)
    }

    @Test
    fun testMultiplicationForTwoNumbers(){
        val calculator = Calculator()
        val result: Int = calculator.multiplication(5, 10)
        assertEquals(50, result)
    }

    @Test
    fun testDivisionByNonZeroNumber(){
        val calculator = Calculator()
        val result: Int = calculator.divide(30, 10)
        assertEquals(3, result)
    }


    /**
     * This function is used to handle exception
     * Result of the function must IllegalArgumentException Class
     */
    @Ignore("test DivisionByZeroNumber is Ignored")
    @Test(expected = IllegalArgumentException::class)
    fun testDivisionByZeroNumber(){
        val calculator = Calculator()
        val result: Int = calculator.divide(30, 0)
        assertEquals(3, result)
    }

}