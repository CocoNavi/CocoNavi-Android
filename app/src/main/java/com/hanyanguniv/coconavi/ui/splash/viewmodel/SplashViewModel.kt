package com.hanyanguniv.coconavi.ui.splash.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.hanyanguniv.coconavi.data.repository.UserRepository
import com.hanyanguniv.coconavi.utils.Resource
import kotlinx.coroutines.Dispatchers

class SplashViewModel : ViewModel() {

    private val userRepository = UserRepository()

    fun postUser(params: HashMap<String, String>) = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = userRepository.postUser(params)))
        } catch (e: Exception) {
            emit(Resource.error(data = null, message = e.message ?: "에러가 발생했습니다."))
        }
    }
}