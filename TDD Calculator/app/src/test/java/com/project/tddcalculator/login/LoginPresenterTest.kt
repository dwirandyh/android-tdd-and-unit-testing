package com.project.tddcalculator.login

import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class LoginPresenterTest {

    private val username: String = "DwiRandyH"
    private val password: String = "12345"

    private val wrongUsername: String = "Dwi"
    private val wrongPassword: String = "54321"

    private lateinit var loginPresenter: LoginPresenter
    private lateinit var mockedLoginView: LoginView

    /**
     * This function will execute before each testMethod running
     */
    @Before
    fun setup(){
        mockedLoginView = mock(LoginView::class.java)
        loginPresenter = LoginPresenter(mockedLoginView)
    }

    @Test
    fun checkUserCanGotoTheMainScreenIfTheCredentialsAreCorrect() {

//        val loginView = mock(LoginView::class.java)
//        val loginPresenter = LoginPresenter(loginView)

        loginPresenter.login(username, password)

        // verify if gotoMainScreenMethod is Called
        verify(mockedLoginView).gotoMainScreen()
    }

    @Test
    fun checkUserHaveErrorMessageIfThereAreWrongCredentials(){

        loginPresenter.login(wrongUsername, wrongPassword)

        verify(mockedLoginView).showErrorMessage()
    }

    @Test
    fun chcekUserWillGetErrorMessageWhenTheyExceedtheAttemptCount(){

        loginPresenter.login(wrongUsername, wrongPassword)
        loginPresenter.login(wrongUsername, wrongPassword)
        loginPresenter.login(wrongUsername, wrongPassword)
        loginPresenter.login(wrongUsername, wrongPassword)

        verify(mockedLoginView).showAttemptsErrorMessage()
    }
}