package com.game.suit

import com.game.suit.model.ItemSuit

object DataSources {
    val guntingData = ItemSuit(
        name = "gunting",
        kalah = "batu",
        menang = "kertas"
    )

    val batuData = ItemSuit(
        name = "batu",
        kalah = "kertas",
        menang = "gunting"
    )

    val kertasData = ItemSuit(
        name = "kertas",
        kalah = "gunting",
        menang = "batu"
    )

    val invalidData = ItemSuit(
        name = "invalid",
        kalah = "invalid",
        menang = "invalid"
    )

    fun convertStringToData(name: String): ItemSuit {
        val data = when (name) {
            "gunting" -> guntingData
            "batu" -> batuData
            "kertas" -> kertasData
            else -> invalidData
        }

        return data
    }

    fun getRandomSuit(): ItemSuit {
        val dataList = listOf(guntingData, batuData, kertasData)
        return dataList.random()
    }

}