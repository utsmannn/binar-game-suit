package com.game.suit.action

import com.game.suit.ActionSuit
import com.game.suit.DataSources
import com.game.suit.model.ItemSuit

class KertasAction : ActionSuit(DataSources.kertasData) {
    override fun menang(): ItemSuit {
        val menang = DataSources.kertasData.menang
        return DataSources.convertStringToData(menang)
    }

    override fun kalah(): ItemSuit {
        val kalah = DataSources.kertasData.kalah
        return DataSources.convertStringToData(kalah)
    }
}