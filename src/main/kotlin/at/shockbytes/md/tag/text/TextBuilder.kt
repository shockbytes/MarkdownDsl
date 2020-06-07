package at.shockbytes.md.tag.text

import at.shockbytes.md.tag.MarkdownTag

class TextBuilder : MarkdownTag() {

    private val sequence = mutableListOf<TextTag>()

    operator fun TextTag.unaryPlus() = sequence.add(this)

    override fun content(): String = sequence.joinToString(" ")
}

fun text(block: TextBuilder.() -> Unit): TextBuilder {
    return TextBuilder().apply(block)
}