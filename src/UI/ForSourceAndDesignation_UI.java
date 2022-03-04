package UI;

import javax.swing.*;

public class ForSourceAndDesignation_UI {
     JTextField tx1;
     JTextField tx2;
    ForSourceAndDesignation_UI(){
        JFrame f = new JFrame();
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        JLabel lb1 = new JLabel("Enter Source");
        lb1.setBounds(50,100, 100,30);
        f.add(lb1);

        tx1 = new JTextField("Enter Source");
        tx1.setBounds(150,100, 100,30);
        f.add(tx1);

        JLabel lb2 = new JLabel("Enter Source");
        lb1.setBounds(50,200, 100,30);
        f.add(lb1);

        tx2 = new JTextField("Enter Designation");
        tx2.setBounds(150,200, 100,30);
        f.add(tx2);

        JButton button = new JButton("Search");
        button.setBounds(150,300, 100,30);
        f.add(button);

        button.addActionListener(e->{
            f.dispose();
            Flight_UI flightUi = new Flight_UI(tx1.getText(), tx2.getText());
        });

    }

}
