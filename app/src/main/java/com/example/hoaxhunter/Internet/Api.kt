package com.example.hoaxhunter.Internet

import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface Api {
    @GET ("antihoax")
    fun getHoax(): Call<ArrayList<HoaxResponse>>
}