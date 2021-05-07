package com.pluto.homework_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            val email = emailAdrs.text.toString()
            val password = passWrd.text.toString()

            if (email == "endnjs2007@gmail.com" && password == "endnjs2007") {

                Toast.makeText(this, "관리자로 로그인되었습니다.", Toast.LENGTH_SHORT).show()
            }

            else {
                Toast.makeText(this, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}