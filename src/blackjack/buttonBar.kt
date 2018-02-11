package blackjack

import blackjack.models.Game
import kotlinx.html.js.onClickFunction
import react.RBuilder
import react.dom.button
import react.dom.div
import react.dom.h1

fun RBuilder.buttonBar(eh:EH){
    div {
        button {
            +"Deal"
            attrs.onClickFunction =  {
                eh.deal()
            }
        }
        button {
            +"Hit"
            attrs.onClickFunction =  {
                eh.hit()
            }
        }
        button {
            +"Stay"
            attrs.onClickFunction =  {
                eh.stay()
            }
        }

    }
}

interface EH {
    fun deal()
    fun stay()
    fun hit()

}


