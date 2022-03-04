package UI;

import storage.BusinnessLogic;

import javax.swing.*;

import java.time.LocalDate;

import static storage.BusinnessLogic.airport;

public class Flight_UI {


    public Flight_UI(String type){
            JFrame f;
            f=new JFrame();
            f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
            JButton back = new JButton("Back");
            String data[][] = null;
          String column[]={"Plane Name","Flight Name", "Flight Id","Source","Destination","Type","Date","Time", "No of Passengers"};
          switch(type){
                case "AF": {
                    data = BusinnessLogic.allFlights();
                    break;
                }

                case "DF": {
                    data = BusinnessLogic.allDomesticFlights();
                    break;
                }

                case "IF": {
                    data = BusinnessLogic.allInternationalFlights();
                    break;
                }

                case "AVF": {
                    data = BusinnessLogic.allAvailableFlights();
                    break;
                }
            }
            JTable jt=new JTable(data,column);
            back.setBounds(10,200,200,30);
            jt.setBounds(30,40,200,300);
            JScrollPane sp=new JScrollPane(jt);
            f.add(back);
            f.add(sp);
            f.setSize(300,400);
            f.setVisible(true);

            back.addActionListener(e->{
                f.dispose();
                Home_UI homeUi = new Home_UI();
            });
        }

        public Flight_UI(String src, String des){
            JFrame f;
            f=new JFrame();
            f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
            JButton back = new JButton("Back");
            JButton addPassenger = new JButton("BOOK");
            String data[][] = null;
            String column[]={"Plane Name","Flight Name", "Flight Id","Source","Destination","Type","Date","Time", "No of Passenger"};
            data = BusinnessLogic.bySourceDesignation(src, des);
            JTable jt=new JTable(data,column);
            back.setBounds(10,200,200,30);
            addPassenger.setBounds(300,200,200,30);
            jt.setBounds(30,40,200,300);
            JScrollPane sp=new JScrollPane(jt);
            f.add(back);
            f.add(addPassenger);
            f.add(sp);
            f.setSize(300,400);
            f.setVisible(true);

            back.addActionListener(e->{
                f.dispose();
                Home_UI homeUi = new Home_UI();
            });

            addPassenger.addActionListener(e->{
                String flightName;
                flightName = JOptionPane.showInputDialog("Enter Flight Name");
                if(flightName!=null && BusinnessLogic.checkFlightName(flightName)){
                    f.dispose();
                    ForID_UI forID_ui = new ForID_UI(flightName);
                }
                else{
                    JOptionPane.showMessageDialog(f,"Something Went Wrong");
                }

            });

        }

        public Flight_UI(LocalDate date){
            JFrame f;
            f=new JFrame();
            f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
            JButton back = new JButton("Back");
            String data[][] = null;
            String column[]={"Plane Name","Flight Name", "Flight Id","Source","Destination","Type","Date","Time", "Passengers"};
            data = BusinnessLogic.getByDate(date);
            JTable jt=new JTable(data,column);
            back.setBounds(10,200,200,30);
            jt.setBounds(30,40,200,300);
            JScrollPane sp=new JScrollPane(jt);
            f.add(back);
            f.add(sp);
            f.setSize(300,400);
            f.setVisible(true);

            back.addActionListener(e->{
                f.dispose();
                Home_UI homeUi = new Home_UI();
            });
    }

    Flight_UI(Integer number){
        JFrame f;
        f=new JFrame();
        f.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        JButton back = new JButton("Back");
        String data[][] = null;
        String column[]={"Plane Name","Flight Name", "Flight Id","Source","Destination","Type","Date","Time", "Passengers"};
        data = BusinnessLogic.getDataByNumber(number);
        JTable jt=new JTable(data,column);
        back.setBounds(10,200,200,30);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(back);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);

        back.addActionListener(e->{
            f.dispose();
            Home_UI homeUi = new Home_UI();
        });
    }
}
