package plugin.override

class Edit {
    interface EditCommand {
        fun command(input: String?)
        fun passive()
    }
}