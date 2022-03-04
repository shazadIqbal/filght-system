package UI;

import storage.BusinnessLogic;

import javax.swing.*;
import java.time.LocalDate;

public class ForID_UI {
    Integer numberOfPassengers;
    JFrame f = new JFrame();
    ForID_UI(String flightName) {

//        Integer arr[] = {1, 2};
//        JComboBox comboBox = new JComboBox(arr);
//        comboBox.setBounds(50, 50, 90, 20);
//        f.add(comboBox);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        JButton back = new JButton("Back");
        back.setBounds(300, 200, 200, 30);
        f.add(back);
        back.addActionListener(event -> {
            f.dispose();
            Home_UI homeUi = new Home_UI();
        });

        JLabel lb2 = new JLabel("Enter Name");
        lb2.setBounds(50, 200, 100, 30);
        f.add(lb2);

        JTextField name = new JTextField();
        name.setBounds(150, 200, 100, 30);
        f.add(name);

        JLabel lb3 = new JLabel("Enter Number");
        lb3.setBounds(50, 300, 100, 30);
        f.add(lb3);

        JTextField number = new JTextField();
        number.setBounds(150, 300, 100, 30);
        f.add(number);

        JButton addButton = new JButton("ADD");
        addButton.setBounds(150, 400, 100, 30);
        f.add(addButton);
        addButton.addActionListener(event -> {
            BusinnessLogic.addPassenger(name.getText(), number.getText(), flightName);
        });
    }
}
