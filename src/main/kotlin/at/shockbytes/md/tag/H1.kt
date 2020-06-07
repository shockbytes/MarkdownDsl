package at.shockbytes.md.tag

class H1(private val content: String) : MarkdownTag() {

    override fun content(): String = "# $content"
}