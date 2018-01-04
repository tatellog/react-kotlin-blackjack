package blackjack

import blackjack.models.Hand
import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUi(hand: Hand) {
    div {
        div { b { +"Player Hand" } }
        div { b {
            hand.cards.forEach {
                div { + it.toString() }
            }
        } }
        div { b { +"${hand.handValue()} Points" } }
    }
}