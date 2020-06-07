package at.shockbytes.md.tag.text

class Italic(private val text: String) : TextTag() {
    override fun content(): String = "*$text*"
}

fun italic(text: String): Italic {
    return Italic(text)
}