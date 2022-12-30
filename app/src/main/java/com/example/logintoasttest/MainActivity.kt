package com.example.logintoasttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        clickBtn.setOnClickListener { 
            val email = inputEmail.text.toString()
            val pwd = inputPwd.text.toString()
            
            if(email == "admin@test.com" && pwd == "qwer"){
                Toast.makeText(this, "관리자 입니다.", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
            
        }
    }
}