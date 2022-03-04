package UI;

import javax.swing.*;

public class passengerAvailable_UI {

    passengerAvailable_UI(){
        JFrame f = new JFrame();
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        JLabel lb1 = new JLabel("Enter Number");
        lb1.setBounds(50,100, 100,30);
        f.add(lb1);

       JTextField passengerNumber = new JTextField("Passenger Number");
        passengerNumber.setBounds(150,100, 200,30);
        f.add(passengerNumber);

        JButton search = new JButton("Search");
        search.setBounds(50, 200, 200, 30);
        f.add(search);

        JButton back = new JButton("Back");
        back.setBounds(50, 300, 200, 30);
        f.add(back);

        search.addActionListener(e->{
            f.dispose();
            Flight_UI flightUi = new Flight_UI(Integer.parseInt(passengerNumber.getText()));
        });

        back.addActionListener(event -> {
            f.dispose();
            Home_UI homeUi = new Home_UI();
        });
    }
}
