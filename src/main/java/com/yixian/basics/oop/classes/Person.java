package com.yixian.basics.oop.classes;

import java.util.Objects;

/**
 * @program: JavaSeStudy
 * @description: 人物
 * @author: zhang_hj
 * @create: 2022-06-26 16:53
 * @version: 1.0.0
 */
public class Person {

    private String name;

    private Vehicles vehicles;


    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(vehicles, person.vehicles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vehicles);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", vehicles=" + vehicles +
                '}';
    }

    public void passRiver() {
        if (!(this.vehicles instanceof Boat)) {
            this.vehicles = VehiclesFactory.getBoatInstance();
        }
        this.vehicles.work();
    }

    public void common() {
        if (!(this.vehicles instanceof Horse)) {
            this.vehicles = VehiclesFactory.getHorseInstance();
        }
        this.vehicles.work();
    }

    public void volcano() {
        if (!(this.vehicles instanceof Plane)) {
            this.vehicles = VehiclesFactory.getPlaneInstance();
        }
        this.vehicles.work();
    }

    public static void main(String[] args) {
        Person person = new Person("唐僧",
                VehiclesFactory.getHorseInstance());
        person.passRiver();
        person.common();
        person.volcano();
    }
}
