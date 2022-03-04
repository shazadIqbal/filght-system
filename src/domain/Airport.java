package domain;

import java.util.ArrayList;
import java.util.List;



public class Airport {
   public String name;
    public String location ;
    public List<Plane> planes = new ArrayList<>();

    public Airport(String name, String location, List<Plane> planes) {
        this.name = name;
        this.location = location;
        this.planes = planes;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", planes=" + planes +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }
}


