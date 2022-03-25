package com.game.suit

import com.game.suit.model.ItemSuit

abstract class ActionSuit(val itemSuit: ItemSuit) : Suit {

    abstract fun menang(): ItemSuit // kalau ini batu, maka function ini adalah gunting
    abstract fun kalah(): ItemSuit

    override fun action(suitName: String): String {
        val suitDataCom = DataSources.convertStringToData(suitName)

        val isMenang = menang() == suitDataCom
        val isKalah = kalah() == suitDataCom
        val isDraw = itemSuit == suitDataCom

        return when {
            isMenang -> "menang!!"
            isKalah -> "kalah!!"
            isDraw -> "seri!!"
            else -> "invalid!!"
        }
    }
}