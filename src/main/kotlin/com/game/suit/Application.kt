package com.game.suit

import com.game.suit.action.BatuAction
import com.game.suit.action.GuntingAction
import com.game.suit.action.InvalidAction
import com.game.suit.action.KertasAction

fun main() {
    println("Masukan input kamu (batu, gunting, kertas)")
    val dataInput = readLine().orEmpty()
    val suitDataUser = DataSources.convertStringToData(dataInput)

    println(suitDataUser)

    val suitUser: Suit = when (suitDataUser.name) {
        "batu" -> BatuAction()
        "gunting" -> GuntingAction()
        "kertas" -> KertasAction()
        else -> InvalidAction()
    }

    val suitDataCom = DataSources.getRandomSuit()

    println("kamu: ${suitDataUser.name} vs com: ${suitDataCom.name}")
    val result = suitUser.action(suitDataCom.name)
    println(result)
}