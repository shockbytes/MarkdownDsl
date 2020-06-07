package at.shockbytes.md.tag

class Image(
        private val altText: String,
        private var url: String = ""
) : MarkdownTag() {

    override fun content(): String  = "![$altText]($url)"

    operator fun String.unaryPlus() {
        url = this
    }
}

fun image(altText: String, block: Image.() -> Unit): MarkdownTag {
    return Image(altText).apply(block)
}
