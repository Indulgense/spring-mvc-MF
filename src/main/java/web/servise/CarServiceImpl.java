package web.servise;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;

    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> showCars(Integer count) {
        return carDAO.showCars(count);
    }

    @Override
    public List<Car> listCars() {
        return carDAO.listCars();
    }
}