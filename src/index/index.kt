package index

import react.dom.b
import react.dom.div
import react.dom.h1
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {

    val rootDiv = document.getElementById("root")
        render(rootDiv) {
            h1 {
                +"Black Jack"
                div {
                    div { b { +"Player Hand" } }
                    div { b { +"cards goes here" } }
                    div { b { + "12 Points" } }
                }
            }
    }
}
