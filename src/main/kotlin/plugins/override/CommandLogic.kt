package plugin.override

data class CommandLogic(
    val name: List<String>,
    val action: (MutableList<String>?) -> Unit
)

typealias Commands = CommandLogic