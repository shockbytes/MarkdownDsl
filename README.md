# MarkdownDsl
Simple Kotlin Markdown DSL to showcase the power of the Kotlin programming language.


# Example
```Kotlin
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
```
