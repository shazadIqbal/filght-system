package domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Plane {
    Integer forFlightId = 0;
    public String name;
    public Integer capacity;
    public List<Flight> flights = new ArrayList<>();
    String flightNames1[]  = {"PAK","LON","MAL","AFR","CAN"};
    public Plane(String name, Integer capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        if(type.equalsIgnoreCase("domestic")){

            this.flights = getDomesticFlights();
        }
        else{
            this.flights = getInternationalFlights();
        }
    }

    private List<Flight> getDomesticFlights(){
        List<Flight> domesticFlights = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            domesticFlights.add(getRandomFlight("flight-"+getAlphaNumericString(3)));
        }
        return domesticFlights;
    }
    private List<Flight> getInternationalFlights(){
        List<Flight> internatonalFlights = new ArrayList<>();
        for(int i = 0; i< 4; i++){
            internatonalFlights.add(getRandomFlight("flight"+getAlphaNumericString(3), flightNames1));
        }
        return internatonalFlights;
    }

    private Flight getRandomFlight(String name){
        String flightNames[]  = {"KHI","ISB","MUL","FSB","LHR"};

        Random rand = new Random();
        Integer rnfn1 = rand.nextInt(flightNames.length-1);
        Integer rnfn2 = (rnfn1 == flightNames.length-1) ? 0 : rnfn1+1;
        Flight fl = new Flight(name ,++forFlightId, flightNames[rnfn1],flightNames[rnfn2],"domestic",getRandomLocalDate(), LocalTime.now(),new ArrayList());
        return fl;
    }
    private Flight getRandomFlight(String name, String []flightNames1){
        Random rand = new Random();
        Integer rnfn1 = rand.nextInt(flightNames1.length-1);
        Integer rnfn2 = (rnfn1 == flightNames1.length-1) ? 0 : rnfn1+1;
        Flight fl = new Flight(name, ++forFlightId, flightNames1[rnfn1], flightNames1[rnfn2],"international", getRandomLocalDate(), LocalTime.now(),new ArrayList());
        return fl;
    }

    private LocalDate getRandomLocalDate(){
        long minDay = LocalDate.of(2021, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2022, 12, 31).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);
        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        return  randomDate;
    }

    private String getAlphaNumericString(int n)
    {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", flights=" + flights +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public String[] getFlightNames1() {
        return flightNames1;
    }

    public void setFlightNames1(String[] flightNames1) {
        this.flightNames1 = flightNames1;
    }
}


