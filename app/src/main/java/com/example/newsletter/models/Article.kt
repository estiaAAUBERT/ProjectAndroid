package com.example.newsletter.models

import java.sql.Date
import java.util.*


data class Article(
        var id: String,
        val source : Source,
        val author:String,
        val title: String,
        val description:String,
        val url: String,
        val urlToImage: String,
        val publishedAt: java.util.Date,
        val content: String,
        var favorite: Int =0
)