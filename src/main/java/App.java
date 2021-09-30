import actions.Action;
import actions.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    List<JButton> buttons = initButtons();

    public static void main(String[] args) {
        new App();
    }

    App() {
        JFrame frame = new JFrame();

        buttons.forEach(frame::add);

        frame.setSize(400, 250);
        frame.setLayout(new GridLayout(5,4));
        frame.setTitle("Sophisticated app");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    static JButton createButton(int i, Action action) {
        JButton button = new JButton("Button " + (char) (64 + i));
        button.addActionListener((event) -> action.perform());
        return button;
    }

    static List<JButton> initButtons() {
        return new ArrayList<>(Arrays.asList(
                createButton(1, new ActionImpl1()),
                createButton(2, new ActionImpl2()),
                createButton(3, new ActionImpl3()),
                createButton(4, new ActionImpl4()),
                createButton(5, new ActionImpl5()),
                createButton(6, new ActionImpl6()),
                createButton(7, new ActionImpl7()),
                createButton(8, new ActionImpl8()),
                createButton(9, new ActionImpl9()),
                createButton(10, new ActionImpl10()),
                createButton(11, new ActionImpl11()),
                createButton(12, new ActionImpl12()),
                createButton(13, new ActionImpl13()),
                createButton(14, new ActionImpl14()),
                createButton(15, new ActionImpl15()),
                createButton(16, new ActionImpl16()),
                createButton(17, new ActionImpl17()),
                createButton(18, new ActionImpl18()),
                createButton(19, new ActionImpl19()),
                createButton(20, new ActionImpl20()))
        );
    }
}
