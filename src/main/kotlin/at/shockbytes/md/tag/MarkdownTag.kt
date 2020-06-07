package at.shockbytes.md.tag

abstract class MarkdownTag {

    abstract fun content(): String

    override fun toString(): String = content()
}

