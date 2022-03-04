package storage;

import UI.ForSourceAndDesignation_UI;
import domain.Airport;
import domain.Flight;
import domain.Passenger;
import domain.Plane;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BusinnessLogic {
    public static Airport airport;

    public static void init(){
        Plane plane1 = new Plane("Boien12",200,"DOMESTIC");
        Plane plane2 = new Plane("Boien13",200,"INTERNATIONAL");
        airport = new Airport("Jinnah-International","Johar", Arrays.asList(plane1, plane2));
    }

    public static Integer passengerOfFlight(String name){
        int count = 0;
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.getName().equalsIgnoreCase(name)){
                    count = fl.getPassengers().size();
                    break;
                }
            }
        }
        return count;
    }

    public static int getNumberFlights() {
        int count = 0;
        for(Plane plane : airport.getPlanes()){
            count+= plane.getFlights().size();
        }
        return count;
    }
    public static int getNumberDomesticFlights(){
        int count = 0;
        for(Plane pl: airport.getPlanes()){
          for(Flight fl: pl.getFlights()){
              if(fl.type.equalsIgnoreCase("domestic")){
                  count++;
              }
          }
        }
        return count;
    }

        public static int getNumberInternationalFlights(){
        int count = 0;
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.type.equalsIgnoreCase("International")){
                    count++;
                }
            }
        }
        return count;
    }

    public static int getNumberAvailableFlights(){
        int count = 0;
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.getDate().isAfter(LocalDate.now())){
                    count++;
                }
            }
        }
        return count;
    }

    public static int getNumberOfSourceDesignation(String tx1, String tx2){
        int count = 0;
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.source.equalsIgnoreCase(tx1) && fl.designation.equalsIgnoreCase(tx2)){
                    count++;
                }
            }
        }
        return count;
    }


    public static int getNumberByDate(LocalDate date){
        int count = 0;
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.date.toString().equalsIgnoreCase(date.toString())){
                    count++;
                }
            }
        }
        return count;
    }

    public static int getNumberData(Integer number){
        int count = 0;
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
               for(Passenger psngr: fl.getPassengers()){
                   if(psngr.phoneNumber.equalsIgnoreCase(number.toString())){
                       count++;
                   }
               }
            }
        }
        return count;
    }

    public static String[][] allFlights(){
        int row = 0;
//        int column = 0;
        String [][]data = new String[getNumberFlights()][9];
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                    Integer passenger = passengerOfFlight(fl.getName());
                    data[row][0] = pl.getName();
                    data[row][1] = fl.getName();
                    data[row][2] = fl.getId().toString();
                    data[row][3] = fl.getSource();
                    data[row][4] = fl.getDesignation();
                    data[row][5] = fl.getType();
                    data[row][6] = fl.getDate().toString();
                    data[row][7] = fl.getTime().toString();
                    data[row][8] = passenger.toString();
                    row++;
            }
        }
        return data;
    }


    public static String[][] allDomesticFlights(){
        int row = 0;
        int column = 0;
        String [][]data = new String[getNumberDomesticFlights()][9];
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.type.equalsIgnoreCase("domestic")){
                    Integer passenger = passengerOfFlight(fl.getName());
                    data[row][0] = pl.getName();
                    data[row][1] = fl.getName();
                    data[row][2] = fl.getId().toString();
                    data[row][3] = fl.getSource();
                    data[row][4] = fl.getDesignation();
                    data[row][5] = fl.getType();
                    data[row][6] = fl.getDate().toString();
                    data[row][7] = fl.getTime().toString();
                    data[row][8] = passenger.toString();
                    row++;
                }
            }
        }
        return data;
    }

    public static String[][] allInternationalFlights(){
        int row = 0;
        int column = 0;
        String [][]data = new String[getNumberInternationalFlights()][9];
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.getType().equalsIgnoreCase("international")){
                    Integer passenger = passengerOfFlight(fl.getName());
                    data[row][0] = pl.getName();
                    data[row][1] = fl.getName();
                    data[row][2] = fl.getId().toString();
                    data[row][3] = fl.getSource();
                    data[row][4] = fl.getDesignation();
                    data[row][5] = fl.getType();
                    data[row][6] = fl.getDate().toString();
                    data[row][7] = fl.getTime().toString();
                    data[row][8] = passenger.toString();
                    row++;
                }
            }
        }
        return data;
    }

    public static String[][] allAvailableFlights(){
        int row = 0;
        int column = 0;
        String [][]data = new String[getNumberAvailableFlights()][9];
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.getDate().isAfter(LocalDate.now())){
                Integer passenger = passengerOfFlight(fl.getName());
                data[row][0] = pl.getName();
                data[row][1] = fl.getName();
                data[row][2] = fl.getId().toString();
                data[row][3] = fl.getSource();
                data[row][4] = fl.getDesignation();
                data[row][5] = fl.getType();
                data[row][6] = fl.getDate().toString();
                data[row][7] = fl.getTime().toString();
                data[row][8] = passenger.toString();
                row++;
                }
            }
        }
        return data;
    }

    public static String[][] bySourceDesignation(String tx1, String tx2){
        int row = 0;
        String [][]data = new String[getNumberOfSourceDesignation(tx1, tx2)][9];
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.source.equalsIgnoreCase(tx1) && fl.designation.equalsIgnoreCase(tx2)){
                Integer passenger = passengerOfFlight(fl.getName());
                data[row][0] = pl.getName();
                data[row][1] = fl.getName();
                data[row][2] = fl.getId().toString();
                data[row][3] = fl.getSource();
                data[row][4] = fl.getDesignation();
                data[row][5] = fl.getType();
                data[row][6] = fl.getDate().toString();
                data[row][7] = fl.getTime().toString();
                data[row][8] = passenger.toString();
                row++;
                }
            }
        }
        return data;
    }

    public static String[][] getByDate(LocalDate date) {
        int row = 0;
        String [][]data = new String[getNumberByDate(date)][9];
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.date.toString().equalsIgnoreCase(date.toString())){
                    Integer passenger = passengerOfFlight(fl.getName());
                    data[row][0] = pl.getName();
                    data[row][1] = fl.getName();
                    data[row][2] = fl.getId().toString();
                    data[row][3] = fl.getSource();
                    data[row][4] = fl.getDesignation();
                    data[row][5] = fl.getType();
                    data[row][6] = fl.getDate().toString();
                    data[row][7] = fl.getTime().toString();
                    data[row][8] = passenger.toString();
                    row++;
                }
            }
        }
        return data;
    }

    public static void addPassenger(String name, String number, String flightName) {
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.getName().equalsIgnoreCase(flightName)){
                    Passenger passenger = new Passenger(name, number);
                    fl.passengers.add(passenger);
                    break;
                }
            }
        }
    }

    public static boolean checkFlightName(String flightName){
        boolean flag = false;
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                if(fl.getName().equalsIgnoreCase(flightName)){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static String[][] getDataByNumber(Integer number){
        int row = 0;
        String [][]data = new String[getNumberData(number)][9];
        for(Plane pl: airport.getPlanes()){
            for(Flight fl: pl.getFlights()){
                for(Passenger psngr: fl.getPassengers()){
                    if(psngr.phoneNumber.equalsIgnoreCase(number.toString())){
                        Integer passenger = passengerOfFlight(fl.getName());
                        data[row][0] = pl.getName();
                        data[row][1] = fl.getName();
                        data[row][2] = fl.getId().toString();
                        data[row][3] = fl.getSource();
                        data[row][4] = fl.getDesignation();
                        data[row][5] = fl.getType();
                        data[row][6] = fl.getDate().toString();
                        data[row][7] = fl.getTime().toString();
                        data[row][8] = passenger.toString();
                        row++;
                    }
                }
            }
        }
        return data;
    }

//    public void hashMap(String flightName){
//        Map <String, Integer> map = new HashMap<>();
//        if(map.containsKey(flightName)){
//
//        }
//    }
}
