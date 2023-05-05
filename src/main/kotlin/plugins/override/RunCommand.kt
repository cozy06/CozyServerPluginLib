package plugin.override

import com.github.cozy06.Logic.Companion.loop

class RunCommand {
    companion object {
        fun Commands.RUN(input: String?) {
            val command: String? = input?.split(" ")?.get(0)
            val parameter: MutableList<String>? = input?.split(" ")?.toMutableList()
            parameter?.removeAt(0)
            loop({
                if (command == this.name[it]) {
                    this.action(parameter)
                }
            }, this.name.size)
        }

        fun command(vararg name: String, action: (MutableList<String>?) -> Unit): Commands {
            return Commands(name.toList(), action)
        }
    }
}