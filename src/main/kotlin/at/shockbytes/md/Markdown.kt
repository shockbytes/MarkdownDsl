package at.shockbytes.md

import at.shockbytes.md.destination.Destination
import at.shockbytes.md.tag.MarkdownTag

class Markdown {

    private val content = mutableListOf<MarkdownTag>()

    operator fun MarkdownTag.unaryPlus() {
        addTag(this)
    }

    private fun addTag(tag: MarkdownTag) {
        content.add(tag)
    }

    private fun content(): String {
        return content.joinToString(System.lineSeparator()) { tag ->
            tag.content()
        }
    }

    override fun toString() = content()

    infix fun outputTo(destination: Destination) {
        destination.writeMarkdown(this)
    }
}

fun markdown(block: Markdown.() -> Unit): Markdown {
    return Markdown().apply(block)
}