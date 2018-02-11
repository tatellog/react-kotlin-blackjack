package blackjack

import blackjack.models.Game
import kotlinx.html.style
import kotlinx.html.title
import react.RBuilder
import react.dom.div
import react.dom.h1


fun RBuilder.gameUi(game: Game, eh: EH){
    div {
        h1 { +"Black Jack"}
        buttonBar(eh)

        div {
            attrs.title = "Foo"
            attrs.style = kotlinext.js.js {
                display = "flex"
            }

            handUi(game.ph)
            handUi(game.dh)

        }
    }

}