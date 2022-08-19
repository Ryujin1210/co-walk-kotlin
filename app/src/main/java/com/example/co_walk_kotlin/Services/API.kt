package com.example.co_walk_kotlin.Services

import com.example.co_walk_kotlin.Data.JwtTokenEmail
import com.example.co_walk_kotlin.Data.UserReq
import com.example.co_walk_kotlin.Data.register
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface API {
    @POST("/user/login")
    @FormUrlEncoded
    fun login(@Field("identifier") id:String, @Field("password") password:String) : Call<UserReq>

    @POST("/user/register")
    @FormUrlEncoded
    fun register(@Field("identifier") id:String, @Field("password") password:String,
                 @Field("email") email:String, @Field("nickname") nickname:String,
                 @Field("jwt_token") jwtTokenEmail : JwtTokenEmail
    ) : Call<register>
}