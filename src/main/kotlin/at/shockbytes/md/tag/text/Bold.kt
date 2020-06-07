package at.shockbytes.md.tag.text

class Bold(private val text: String) : TextTag() {
    override fun content(): String = "**$text**"
}

fun bold(text: String): Bold {
    return Bold(text)
}