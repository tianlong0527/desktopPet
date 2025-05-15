import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class startScreen {
    public startScreen() {
        JFrame frame = new JFrame("desktopPet");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridBagLayout());

        JButton startButton = new JButton("召喚桌寵");
        startButton.setSize(new Dimension(200, 100));
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO: Add action to start the pet
                frame.dispose();
            }
        });
        frame.add(startButton);
        frame.setVisible(true);
    }
}
