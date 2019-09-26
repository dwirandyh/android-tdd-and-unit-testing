package com.project.tddcalculator.login

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.project.tddcalculator.MainActivity
import com.project.tddcalculator.R

class LoginActivity : AppCompatActivity(), LoginView {

    private lateinit var loginPresenter: LoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginPresenter = LoginPresenter(this)
    }

    override fun gotoMainScreen() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun showErrorMessage() {
        Toast.makeText(this, "Your email or password incorrect", Toast.LENGTH_SHORT).show()
    }

    override fun showAttemptsErrorMessage() {
        Toast.makeText(this, "You reach maximum attempts, try again later", Toast.LENGTH_SHORT).show()
    }
}