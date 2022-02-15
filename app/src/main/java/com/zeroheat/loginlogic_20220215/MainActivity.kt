package com.zeroheat.loginlogic_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        => 아이디가 "admin" 이고, 비밀번호가 "asdf" 라면, 로그인 성공.
//      => "관리자님 환영합니다." 토스트 출력
//    - 실패시
//      => "로그인에 실패했습니다." 토스트 출력

//        - 아이디부터 틀린 아이디라면, (admin이 아니라면)
//    => "아이디가 잘못되었습니다." 토스트
//
//  - 비번만 틀린 비번이면,
//    => "비밀번호가 잘못되었습니다." 토스트

        btnLogin.setOnClickListener {

            var ID = EdtText1.text.toString()
            var PASS = EdtText2.text.toString()

            if(ID == "admin" && PASS == "asdf"){
                Toast.makeText(this, "관리자님 환영합니다.", Toast.LENGTH_SHORT).show()
            }else if(ID != "admin" && PASS == "asdf"){
                Toast.makeText(this, "아이디가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            }else if(ID == "admin" && PASS != "asdf"){
                Toast.makeText(this, "비밀번호가 잘못되었습니다.", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "로그인에 실패했습니다.", Toast.LENGTH_SHORT).show()
            }


        }

    }
}