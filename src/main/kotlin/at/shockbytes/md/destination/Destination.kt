package at.shockbytes.md.destination

import at.shockbytes.md.Markdown

interface Destination {

    fun writeMarkdown(markdown: Markdown)
}