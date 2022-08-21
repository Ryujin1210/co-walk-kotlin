package com.example.co_walk_kotlin.Services

import com.example.co_walk_kotlin.Data.JwtTokenEmail
import com.example.co_walk_kotlin.Data.ResUser
import com.example.co_walk_kotlin.Data.UserReq
import com.example.co_walk_kotlin.Data.register
import retrofit2.Call
import retrofit2.http.*

interface API {
    @POST("/user/login")
    @FormUrlEncoded
    //fun login(@Field("identifier") id:String, @Field("password") password:String) : Call<UserReq>
    fun login(@Body req: UserReq) : Call<ResUser>

    @POST("/user/register")
    @FormUrlEncoded
    fun register(@Field("identifier") id:String, @Field("password") password:String,
                 @Field("email") email:String, @Field("nickname") nickname:String,
                 @Field("jwt_token") jwtTokenEmail : JwtTokenEmail
    ) : Call<register>


}