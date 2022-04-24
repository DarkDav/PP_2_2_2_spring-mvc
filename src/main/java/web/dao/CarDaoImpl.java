package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    @Override
    public List<Car> getCars(int count) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("BMW", "white", 2011));
        carsList.add(new Car("Fiesta", "green", 2015));
        carsList.add(new Car("Logitt", "blue", 2022));
        carsList.add(new Car("Lada", "black", 2014));
        carsList.add(new Car("Niva", "rose", 2011));
        return carsList.stream().limit(count).collect(Collectors.toList());
    }
}

