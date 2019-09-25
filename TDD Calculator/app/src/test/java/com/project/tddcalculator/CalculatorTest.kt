package com.project.tddcalculator

import junit.framework.Assert.assertEquals
import org.junit.*
import java.lang.IllegalArgumentException

class CalculatorTest {

    private var calculator: Calculator? = null

    companion object{

        /**
         * This method will be called in first time and only once
         */
        @BeforeClass
        @JvmStatic fun init(){
            println("@BeforeClass is called")
        }

        /**
         * This method will be called after all other method have been executed
         */
        @AfterClass
        @JvmStatic fun destroy(){
            println("@AfterClass is called")
        }
    }

    /**
     * this function will run before each function run
     */
    @Before
    fun setup(){
        calculator = Calculator()
        println("@Before is called")
    }

    /**
     * this function will run after each function run
     */
    @After
    fun teardown(){
        calculator = null
        println("@After is called")
    }

    @Test
    fun testAddingTwoPositiveNumbers(){
//        val calculator = Calculator() // this line commented because we will use public property that has initialize in after function
        val result: Int = calculator?.add(20, 50) ?: 0
        assertEquals(70, result)
    }

    @Test
    fun testSubtractionPositiveNumbers(){
//        val calculator = Calculator()
        val result: Int = calculator?.subtraction(2, 10) ?: 0
        assertEquals(20, result)
    }

    @Test
    fun testMultiplicationForTwoNumbers(){
//        val calculator = Calculator()
        val result: Int = calculator?.multiplication(5, 10) ?: 0
        assertEquals(50, result)
    }

    @Test
    fun testDivisionByNonZeroNumber(){
//        val calculator = Calculator()
        val result: Int = calculator?.divide(30, 10) ?: 0
        assertEquals(3, result)
    }


    /**
     * This function is used to handle exception
     * Result of the function must IllegalArgumentException Class
     */
    @Ignore("test DivisionByZeroNumber is Ignored")
    @Test(expected = IllegalArgumentException::class)
    fun testDivisionByZeroNumber(){
//        val calculator = Calculator()
        val result: Int = calculator?.divide(30, 0) ?: 0
        assertEquals(3, result)
    }

}