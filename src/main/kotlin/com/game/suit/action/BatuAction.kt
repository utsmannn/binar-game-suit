package com.game.suit.action

import com.game.suit.ActionSuit
import com.game.suit.DataSources
import com.game.suit.model.ItemSuit

class BatuAction : ActionSuit(DataSources.batuData) {
    override fun menang(): ItemSuit {
        val menang = DataSources.batuData.menang // gunting
        return DataSources.convertStringToData(menang) // item gunting
    }

    override fun kalah(): ItemSuit {
        val kalah = DataSources.batuData.kalah
        return DataSources.convertStringToData(kalah)
    }
}