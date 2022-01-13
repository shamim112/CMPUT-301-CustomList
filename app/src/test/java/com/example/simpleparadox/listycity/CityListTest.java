package com.example.simpleparadox.listycity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Dhaka", "Rajshahi");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.getCities().size());

        City city = new City("NY", "AZ");
        cityList.add(city);

        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();

        City city = new City("Khulna", "Sylhet");
        cityList.add(city);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));

        City city = new City("Barisal", "Rangpur");
        cityList.add(city);

        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }


    @Test
    void testDeleteCity(){
        CityList cityList = new CityList();
        City city1 = new City("Sathkhira", "Khulna");
        City city2 = new City("Bogura", "Rajshahi");
        cityList.add(city1);
        cityList.add(city2);

        assertEquals(2, cityList.countCities());
        cityList.deleteCity(city1);
        assertEquals(1, cityList.countCities());
    }

    @Test
    void CountCities(){
        CityList _cityList = mockCityList();
        City city1 = new City("Sathkhira", "Khulna");
        _cityList.add(city1);

        assertEquals(2,_cityList.countCities());
    }
}
