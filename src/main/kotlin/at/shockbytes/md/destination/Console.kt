package at.shockbytes.md.destination

import at.shockbytes.md.Markdown

object Console : Destination {

    override fun writeMarkdown(markdown: Markdown) {
        println(markdown.toString())
    }
}