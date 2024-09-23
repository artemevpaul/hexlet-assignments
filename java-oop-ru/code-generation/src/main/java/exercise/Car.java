package exercise;

import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize(Car car) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        String value = mapper.writeValueAsString(car);
        return value;
    }
    public static Car deserealize(String value) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Car car =  mapper.readValue(value, Car.class);
        return car;
    }
    // END
}
