package com.hanyanguniv.coconavi.data.repository

import com.hanyanguniv.coconavi.data.api.ApiService
import com.hanyanguniv.coconavi.data.api.RetrofitBuilder

class UserRepository {

    private val client: ApiService = RetrofitBuilder.apiService

    suspend fun postUser(params: HashMap<String, String>) = client.postUser(params)
}