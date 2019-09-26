package com.project.tddcalculator.login

class LoginPresenter(
    val loginView: LoginView
) {

    private val USERNAME: String = "DwiRandyH"
    private val PASSWORD: String = "12345"

    var attemptsCount = 0
    val MAX_ATTEMPS_COUNT: Int = 3


    fun login(username: String, password: String) {
        if (isAttemptsCountExceeded()){
            loginView.showAttemptsErrorMessage()
            return
        }

        if (username.equals(USERNAME) && password.equals(PASSWORD)) {
            loginView.gotoMainScreen()
        } else {
            incrementAttemptsCount()
            loginView.showErrorMessage()
        }
    }

    fun incrementAttemptsCount() {
        attemptsCount++
    }

    fun isAttemptsCountExceeded() : Boolean {
        return attemptsCount >= MAX_ATTEMPS_COUNT
    }

}