package com.example.mvp_login_tutorial.Model

import android.text.TextUtils
import android.util.Patterns

public class User(private var mail: String, private var pword: String) : IUser{
    override fun getEmail(): String {
return mail    }

    override fun getPassword(): String {
return pword   }

    override fun isValidData(): Int {
        //0 check email is empty
        //1 email matches pattern
        //2 pw length >6
        if(getEmail().isEmpty())
            return 0
        else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches())
            return 1
        else if( getPassword().length < 6)
            return 2
        else
            return -1

    }
}