package UI;

import javax.swing.*;
import java.time.LocalDate;

public class ForDate_UI {
    ForDate_UI(){
        JFrame f = new JFrame();
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        JLabel lb1 = new JLabel("Enter Date");
        lb1.setBounds(50,100, 100,30);
        f.add(lb1);

        JTextField tx1 = new JTextField();
        tx1.setBounds(150,100, 100,30);
        f.add(tx1);

        JButton button = new JButton("Search");
        button.setBounds(150,200, 100,30);
        f.add(button);

        JButton back = new JButton("Back");
        back.setBounds(10,400,200,30);
        f.add(back);

        back.addActionListener(e->{
            f.dispose();
            Home_UI homeUi = new Home_UI();
        });

        button.addActionListener(e->{
            f.dispose();
            Flight_UI flightUi = new Flight_UI(LocalDate.parse(tx1.getText()));
        });
    }
}
