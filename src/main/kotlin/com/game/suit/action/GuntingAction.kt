package com.game.suit.action

import com.game.suit.ActionSuit
import com.game.suit.DataSources
import com.game.suit.model.ItemSuit

class GuntingAction : ActionSuit(DataSources.guntingData) {
    override fun menang(): ItemSuit {
        val menang = DataSources.guntingData.menang
        return DataSources.convertStringToData(menang)
    }

    override fun kalah(): ItemSuit {
        val kalah = DataSources.guntingData.kalah
        return DataSources.convertStringToData(kalah)
    }
}