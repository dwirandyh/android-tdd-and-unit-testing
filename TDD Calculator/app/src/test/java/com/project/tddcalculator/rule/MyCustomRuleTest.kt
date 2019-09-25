package com.project.tddcalculator.rule

import org.junit.Rule
import org.junit.Test

/**
 * Use Custom Rule
 */
class MyCustomRuleTest {

    @get:Rule
    var myCustomRule: MyCustomRule = MyCustomRule()


    @Test
    fun testWarningRuleMessage(){
        myCustomRule.logger?.warning("Message From testWarningRule method")
    }

    @Test
    fun testSecondWarningRuleMessage(){
        myCustomRule.logger?.warning("Message From testWarningRule method")
    }
}