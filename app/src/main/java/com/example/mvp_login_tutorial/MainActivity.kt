package com.example.mvp_login_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.mvp_login_tutorial.Presenter.ILoginPresenter
import com.example.mvp_login_tutorial.Presenter.LoginPresenter
import com.example.mvp_login_tutorial.View.ILoginView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),ILoginView{

    lateinit var edit_email : EditText
    lateinit var edit_password : EditText
    lateinit var btnLogin : Button

    lateinit var loginPresenter: ILoginPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Init View
        btnLogin=btn_login
        edit_email=edt_email
        edit_password=edt_password

        //Init
        loginPresenter=LoginPresenter(this)

        //Event

//        btnLogin.apply { setOnClickListener { loginPresenter.onLogin(edit_email.text.toString(),edit_password.text.toString()) } }
        btnLogin.setOnClickListener { loginPresenter.onLogin(edit_email.text.toString(),edit_password.text.toString()) }


    }

    override fun onLoginResult(message: String) {
Toast.makeText(this,message,Toast.LENGTH_SHORT).show()    }
}
