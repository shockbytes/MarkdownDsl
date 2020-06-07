package at.shockbytes.md.destination

import java.io.File
import at.shockbytes.md.Markdown

class File(private val path: String) : Destination {
    override fun writeMarkdown(markdown: Markdown) {
        File(path).writeText(markdown.toString())
    }
}