package com.dottest.model

object ListData {
    data class ListDataResponse(val status_code: Int, val data: MutableList<Data>)
    data class Data(val id: Int,
                    val title: String,
                    val content: String,
                    val type: String,
                    val media: MutableList<String>)
}