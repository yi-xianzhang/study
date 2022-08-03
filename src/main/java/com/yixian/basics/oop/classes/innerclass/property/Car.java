package com.yixian.basics.oop.classes.innerclass.property;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * @author : zhang_hj
 * @version : 1.0.0
 * @program : JavaSeStudy
 * @description : 汽车
 * @create : 2022-06-26 17:29
 */
public class Car {

    private static final Logger LOGGER = LoggerFactory.getLogger(Car.class);

    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.temperature, temperature) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature);
    }

    @Override
    public String toString() {
        return "Car{" +
                "temperature=" + temperature +
                '}';
    }

    private class Air {
        private void flow() {
            if (temperature < 0) {
                LOGGER.info("车内温度：" + temperature  + ",打开空调吹热风");
            } else if (temperature < 30) {
                LOGGER.info("车内温度：" + temperature  + ",关闭空调");
            } else {
                LOGGER.info("车内温度：" + temperature  + ",打开空调吹冷风");
            }
        }
    }


    public void show() {
        Air air = new Air();
        air.flow();
    }

    public static void main(String[] args) {
        Car car = new Car(40);
        car.show();

        car.setTemperature(23);
        car.show();

        car.setTemperature(-12);
        car.show();
    }
}
