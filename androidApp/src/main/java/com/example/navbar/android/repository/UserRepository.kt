package com.example.navbar.android.repository

import androidx.lifecycle.LiveData
import com.example.navbar.android.model.User
import com.example.stevdza_san.data.UserDao

class UserRepository(private val userDao : UserDao) {
    val readAllData : LiveData<List<User>> =  userDao.readAllData()

    fun addUser(user : User){
        userDao.addUser(user)
    }

    fun updateUser(user: User){
        userDao.updateUser(user)
    }

    fun deleteUser(user: User){
        userDao.deleteUser(user)
    }

    fun deleteAllUser(){
        userDao.deleteAllUser()
    }
}