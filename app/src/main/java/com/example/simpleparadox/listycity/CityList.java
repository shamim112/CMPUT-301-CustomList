package com.example.simpleparadox.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * Add new city
     * @param city
     *      City to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }


    /**
     * Delete a city
     * @param _city
     */
    public void deleteCity(City _city){
        cities.remove(_city);
    }


    /**
     * Returns city count
     */
    public int countCities() {
        return cities.size();
    }


    /**
     * Returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
}
