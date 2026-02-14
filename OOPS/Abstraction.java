// package OOPS;

// public class Abstraction {
//     public static void main(String[] args) {
//         // Horse h = new Horse();
//         // h.eat();
//         // h.walk();
//         // Chicken c = new Chicken();
//         // c.eat();
//         // c.walk();
//         Mustang myMustang = new Mustang(); 
//         // Animal->Horse->Mustang
//         // So first Ainmal constructor will be called then horse then mustang
        
        
//     }
// }


// // abstract keyword to declare abstract class

// abstract class Animal{
//     String color;
//     // Constructor of Abstract class
//     Animal(){
//         System.out.println("Animal Constructor called....");
//         // color = "brown";
//     }
// // Methods inside can be abstract or non abstract as well 
//     void eat(){
//         System.out.println("Animal eats");
//     }
//     // We know this is an abstrat menthod because I didn't write it's implementation inside it
//     // Implementations will be written in subclass
//     abstract void walk();
// }

// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse Constructor called....");
//     }
//     // Here we are supposed to write it's implementation - compulsory to wite
//     void changeColor(){
//         // This will not get printed because Animal() constructor got executed first
//         color = "dark Brown";
//     }
//     void walk(){
//         System.out.println("Walks on 4 legs");
//     }
// }

// // class Chicken extends Animal{
// //     // Here as well we have to implement the method walk() by definition
// //     void walk(){
// //         System.out.println("Walks on 2 legs");
// //     }
// // }

// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang Constructor called....");
//     }
// }