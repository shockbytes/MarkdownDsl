package at.shockbytes.md

import at.shockbytes.md.destination.Console
import at.shockbytes.md.tag.*
import at.shockbytes.md.tag.text.bold
import at.shockbytes.md.tag.text.italic
import at.shockbytes.md.tag.text.plainText
import at.shockbytes.md.tag.text.text

object Example {

    @JvmStatic
    fun main(args: Array<String>) {

        markdown {

            +H1("My super cool markdown sample!")
            +LineBreak

            +table {
                +header {
                    +"Java"
                    +"Kotlin"
                    +"Dart"
                }
                +body {
                    +plainText("Is alright")
                    +image(altText = "Is awesome") {
                        +"https://kotlinlang.org/assets/images/open-graph/kotlin_250x250.png"
                    }
                    +plainText("is also alright")
                }
            }

            +LineBreak
            +text {
                +plainText("We do love")
                +bold("infix functions")
                +italic("too")
            }
        } outputTo Console
    }
}