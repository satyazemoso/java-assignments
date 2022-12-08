package org.lamdasInterfacesStreams.interfaces;

interface Engine {
    default String make() {
        return "DEFAULT MAKE";
    }
}

interface Vehicle {
    default String model() {
        return "DEFAULT MODEL";
    }
}

class Car implements Engine, Vehicle {
    public String makeAndModel() {
        return Engine.super.make() + " " + Vehicle.super.model();
    }
}

public class MultipleInheritance {
    public static void main(String args[]) {
        Car carImpl = new Car();
        System.out.println(carImpl.makeAndModel());

    }


}
