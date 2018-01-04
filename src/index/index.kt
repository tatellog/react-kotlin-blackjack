
package index

import blackjack.gameUi
import blackjack.models.Game
import react.dom.render
import kotlin.browser.document

val game = Game()

fun main(args: Array<String>) {

    val rootDiv = document.getElementById("root")
        render(rootDiv) {
            gameUi(game)

    }
}


