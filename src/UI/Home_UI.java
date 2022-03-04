package UI;

import storage.BusinnessLogic;

import javax.swing.*;

public class Home_UI {

    public Home_UI() {

        JFrame f = new JFrame();

        f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        JButton b1 = new JButton("All Flights");
        JButton b2 = new JButton("All Domestic Flights");
        JButton b3 = new JButton("All International Flights");
        JButton b4 = new JButton("All Available Flights");
        JButton b5 = new JButton("Check Flights by Source And Designation");
        JButton b6 = new JButton("Check Flights by Date & Time");
        JButton b7 = new JButton("Add Passenger By Flight ID In Domestic");
        JButton b8 = new JButton("Add Passenger By Flight ID In International");
        JButton b9 = new JButton("Check Passenger By Number");

        b1.setBounds(50, 100, 300, 30);
        b2.setBounds(50, 150, 300, 30);
        b3.setBounds(50, 200, 300, 30);
        b4.setBounds(50, 250, 300, 30);
        b5.setBounds(50, 300, 300, 30);
        b6.setBounds(50, 350, 300, 30);
        b7.setBounds(50, 400, 300, 30);
        b8.setBounds(50, 450, 300, 30);
        b9.setBounds(50, 500, 300, 30);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);

        b1.addActionListener(e->{
            f.dispose();
            Flight_UI flightUi = new Flight_UI("AF");
        });
        b2.addActionListener(e->{
            f.dispose();
            Flight_UI flightUi = new Flight_UI("DF");
        });
        b3.addActionListener(e->{
            f.dispose();
            Flight_UI flightUi = new Flight_UI("IF");
        });
        b4.addActionListener(e->{
            f.dispose();
            Flight_UI flightUi = new Flight_UI("AVF");
        });
        b5.addActionListener(e->{
            f.dispose();
            ForSourceAndDesignation_UI sourceAndDesignation_ui = new ForSourceAndDesignation_UI();
        });
        b6.addActionListener(e->{
            f.dispose();
            ForDate_UI date_ui = new ForDate_UI();
        });
        b7.addActionListener(e->{
            f.dispose();
            ForID_UI forID_ui = new ForID_UI("domestic");
        });
        b8.addActionListener(e->{
            f.dispose();
            ForID_UI forID_ui = new ForID_UI("international");
        });

        b9.addActionListener(e->{
            f.dispose();
            passengerAvailable_UI passengerAvailable_ui = new passengerAvailable_UI();
        });


    }
}
