package com.example.mvp_login_tutorial.Presenter

import com.example.mvp_login_tutorial.Model.User
import com.example.mvp_login_tutorial.View.ILoginView

class LoginPresenter(var loginView: ILoginView) : ILoginPresenter {


    override fun onLogin(email: String, password: String) {
        var user = User(email, password)
        var isLoginSuccess = user.isValidData()
        if (isLoginSuccess==0)
            loginView.onLoginResult("Email empty")
        else if(isLoginSuccess==1)
            loginView.onLoginResult("wrong format mail")
        else if(isLoginSuccess==2)
            loginView.onLoginResult("small PW")
        else
            loginView.onLoginResult("Login success")
    }
}