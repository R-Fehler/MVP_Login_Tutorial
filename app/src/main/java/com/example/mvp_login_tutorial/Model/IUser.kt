package com.example.mvp_login_tutorial.Model

public interface IUser{
    fun getEmail() :String
    fun getPassword() :String
    fun isValidData() : Int

}