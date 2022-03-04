package domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Flight {
   public String name ;
   public Integer id ;
   public String source;
   public String designation;
   public String type;
   public LocalDate date;
   public LocalTime time;
   public List<Passenger> passengers = new ArrayList<>();

    public Flight(String name, Integer id, String source, String designation, String type, LocalDate date, LocalTime time, List<Passenger> passengers) {
        this.name = name;
        this.id = id;
        this.source = source;
        this.designation = designation;
        this.type = type;
        this.date = date;
        this.time = time;
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", source='" + source + '\'' +
                ", designation='" + designation + '\'' +
                ", type='" + type + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", passengers=" + passengers +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
