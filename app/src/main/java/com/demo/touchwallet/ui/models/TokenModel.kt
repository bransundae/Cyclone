package com.demo.touchwallet.ui.models

data class TokenModel(
    val tokenName: String,
    val tokenSymbol: String,
    val tokenBalance: Float,
    val tokenImageResourceId: Int,
)