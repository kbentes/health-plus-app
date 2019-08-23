package com.example.healthplusapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.healthplusapp.adapter.Utils
import kotlinx.android.synthetic.main.login.*
import com.example.healthplusapp.FilterActivity

class LoginActivity : AppCompatActivity() {

    //region override functions
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        initDataBindings()

        initActions()
    }
    //endregion


    private fun initDataBindings() {
        val id = R.drawable.login_background
        Utils.setImageToImageView(applicationContext, bgImageView, id)
    }

    private fun initActions() {
        forgotTextView.setOnClickListener {
            Toast.makeText(applicationContext, "Clicked Forgot Password.", Toast.LENGTH_SHORT).show()
        }

        signuptTextView.setOnClickListener { Toast.makeText(applicationContext, "Clicked Sign Up.", Toast.LENGTH_SHORT).show() }

        loginButton.setOnClickListener {
            val intent = Intent(applicationContext, FilterActivity::class.java)
            startActivity(intent);
            //Toast.makeText(applicationContext, "Clicked Login.", Toast.LENGTH_SHORT).show()
        }

    }


    //endregion
}
