package com.example.tae_kotlin_rxjava2_exo.retrofit

import PostsModel
import android.database.Observable
import retrofit2.http.GET

//IMyAPI

interface RetrofitInterface {

    @get:GET("posts")
    val posts:Observable<List<PostsModel>>
}
