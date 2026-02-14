package OOPS;

public class MethodOverloading {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(13, 15));
        // System.out.println(calc.sum(13, 15,67));
        // System.out.println(calc.sum((float)13.3,(float) 15.4));

        Auto auto = new Auto();
        auto.tyres();    //Has 3 tyres will be printed 
    }
}

// Method Overloading
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}

class Vehicle{
    void tyres(){
        System.out.println("Has 4 tyres");
    }
}
class Auto extends Vehicle{
    void tyres(){
        System.out.println("Has 3 tyres");
    }
}