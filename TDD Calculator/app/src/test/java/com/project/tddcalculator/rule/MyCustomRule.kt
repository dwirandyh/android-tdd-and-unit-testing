package com.project.tddcalculator.rule

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement
import java.util.logging.Logger

class MyCustomRule : TestRule {

    var logger: Logger? = null

    override fun apply(base: Statement?, description: Description?): Statement? {

        logger = Logger.getLogger(MyCustomRule::class.simpleName + ": this is my custom rule")

        base?.evaluate()

        return base
    }
}