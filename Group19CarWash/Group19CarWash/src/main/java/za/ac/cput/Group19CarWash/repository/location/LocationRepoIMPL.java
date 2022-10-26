/*
Keallan Saunders 219169357
ADP3 ASSIGNMENT1
DD: Oct 2022
LocationRepoIMPL.java
**************** DO NOT TOUCH ********************
 */
package za.ac.cput.Group19CarWash.repository.location;
import za.ac.cput.Group19CarWash.domain.Location;

import java.util.ArrayList;
import java.util.List;

public class LocationRepoIMPL {
    private final List<Location> LocationList;

    private static LocationRepoIMPL LOCATION_REPOSITORY;

    private LocationRepoIMPL(){this.LocationList= new ArrayList<>();}

    public static LocationRepoIMPL getLocationList(){
        if(LOCATION_REPOSITORY == null)
            LOCATION_REPOSITORY = new LocationRepoIMPL();
        return LOCATION_REPOSITORY;
    }
    public Location create(Location location){
        this.LocationList.add(location);
        return location;
    }

    public Location read(String a){
        return this.LocationList.stream().filter(g -> g.getBranchId().equalsIgnoreCase(a)).findAny().orElse(null);
    }

    public Location update(Location location){
        Location a = read(location.getBranchId());
        if(a != null){
            delete(a.getBranchId());
            return create(location);
        }
        return null;
    }
    //public boolean return false
    public boolean delete(String a){
        Location location = read(a);
        if (location != null) this.LocationList.remove(location);
        return false;
    }

    public List<Location> findAll(){return this.LocationList;}
}
