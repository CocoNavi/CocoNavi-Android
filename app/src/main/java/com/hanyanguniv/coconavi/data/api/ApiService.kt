package com.hanyanguniv.coconavi.data.api

import com.hanyanguniv.coconavi.data.model.UserPostResponse
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {

    @Headers("accept: application/json", "content-type: application/json")
    @POST("/users/login/google/")
    suspend fun postUser(@Body params: HashMap<String, String>): UserPostResponse
}