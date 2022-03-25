package com.game.suit.action

import com.game.suit.ActionSuit
import com.game.suit.DataSources
import com.game.suit.model.ItemSuit

class InvalidAction : ActionSuit(DataSources.invalidData) {
    override fun menang(): ItemSuit {
        return DataSources.invalidData
    }

    override fun kalah(): ItemSuit {
        return DataSources.invalidData
    }
}