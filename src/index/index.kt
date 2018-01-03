package index

import kotlinext.js.js
import kotlinx.html.style
import kotlinx.html.title
import react.dom.*
import kotlin.browser.document

fun main(args: Array<String>) {

    val rootDiv = document.getElementById("root")
        render(rootDiv) {
            div {
                h1 { +"Black Jack"}

                div {
                    attrs.title = "Foo"
                    attrs.style = js{
                        display = "flex"
                    }

                    div {
                        div { b { +"Player Hand" } }
                        div { b { +"cards goes here" } }
                        div { b { +"12 Points" } }
                    }

                    div {
                        div { b { +"Dealer Hand" } }
                        div { b { +"cards goes here" } }
                        div { b { +"14 Points" } }
                    }
                }

            }
    }
}
