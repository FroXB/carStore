package br.com.carstore.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import br.com.carstore.dao.CarDao;
import br.com.carstore.model.Car;


@WebServlet("/create-car")
public class CreateCarServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String carName = req.getParameter("car-name");

        Car carro = new Car();
        CarDao carDao = new CarDao();

        carro.setName(carName);

        carDao.createCar(carro);



        req.getRequestDispatcher("index.html").forward(req, resp);

    }
}