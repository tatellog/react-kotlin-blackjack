package blackjack

import kotlinx.html.style
import kotlinx.html.title
import react.RBuilder
import react.dom.div
import react.dom.h1

fun RBuilder.gameUi(){
    div {
        h1 { +"Black Jack"}

        div {
            attrs.title = "Foo"
            attrs.style = kotlinext.js.js {
                display = "flex"
            }

            handUi()
            handUi()

        }
    }

}