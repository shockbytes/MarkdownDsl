package at.shockbytes.md.tag.text

class PlainText(private val text: String) : TextTag() {
    override fun content(): String = text
}

fun plainText(plainText: String): TextTag {
    return PlainText(plainText)
}
