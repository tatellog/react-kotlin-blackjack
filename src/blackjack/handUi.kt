package blackjack

import react.RBuilder
import react.dom.b
import react.dom.div

fun RBuilder.handUi() {
    div {
        div { b { +"Player Hand" } }
        div { b { +"cards goes here" } }
        div { b { +"12 Points" } }
    }
}