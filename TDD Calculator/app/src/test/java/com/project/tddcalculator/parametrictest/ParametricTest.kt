package com.project.tddcalculator.parametrictest

import com.project.tddcalculator.Calculator
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import java.util.*
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@RunWith(Parameterized::class)
class ParametricTest(
    private var numberA: Int,
    private var numberB: Int,
    private var expected: Int
) {

    @Test
    fun testAddingTwoNumbers(){
        val calculator = Calculator()
        assertEquals(expected, calculator.add(numberA, numberB))
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters
        fun dataset(): List<Array<Int>> {
            return arrayListOf(
                arrayOf(1, 2, 4),
                arrayOf(4, 5, 9),
                arrayOf(3, 3, 6)
            ).toList()
        }
    }


}