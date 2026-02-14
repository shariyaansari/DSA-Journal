package OOPS;

class Automobile{
    // private String drive() {
    //     return"Driving vehicle";
    // }
}
class Car extends Automobile{
    protected String drive() {
        return"Driving car";
    }
}
class ElectricCar extends Car{
    @Override
    public final String drive() {
        return"Driving electric car";
    }
    public static void main(String[] wheels) {
        Car car=new ElectricCar();
        System.out.print(car.drive());
    }
}
// A. Driving vehicleB. Driving electric carC. Driving carD. The code does not compile

