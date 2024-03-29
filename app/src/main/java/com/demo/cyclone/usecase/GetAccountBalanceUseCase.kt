package com.demo.cyclone.usecase

import android.content.Context
import com.demo.cyclone.repository.CMCRepository
import com.demo.cyclone.repository.SolanaRPCRepository
import com.demo.cyclone.ui.models.SolanaAccountModel

object GetAccountBalanceUseCase {
    suspend fun getAccountBalance(
        context: Context,
        pubKey: String,
    ): SolanaAccountModel {
        val solanaRepository = SolanaRPCRepository.getInstance()

        val balance = solanaRepository.getBalance(
            pubKey = pubKey, context = context
        )

        return SolanaAccountModel(
            publicKey = pubKey,
            lamports = balance?.result?.value ?: 0f
        )
    }
}