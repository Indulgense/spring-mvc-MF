package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO{
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Car1","Color1",1));
        cars.add(new Car("Car2","Color2",2));
        cars.add(new Car("Car3","Color3",3));
        cars.add(new Car("Car4","Color4",4));
        cars.add(new Car("Car5","Color5",5));
    }

    @Override
    public List<Car> listCars() {
        return cars;
    }

    @Override
    public List<Car> showCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
