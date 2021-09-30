import App.initButtons
import java.awt.Dimension
import java.awt.GridLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.WindowConstants

val buttons = listOf(
    JButton("")
)

fun main() = JFrame().let {
    for (button in initButtons()) it.add(button)
    it.size = Dimension(400, 250)
    it.layout = GridLayout(5, 4)
    it.title = "Sophisticated app"
    it.isVisible = true
    it.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
}
