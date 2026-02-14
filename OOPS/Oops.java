package OOPS;
 
public class Oops {
//    public static void main(String[] args) {
//         // Pen() is called as constructor
//         Pen1 p1 = new Pen1();   // this is a pen object called p1
//         p1.setColor("Blue");
//         System.out.println(p1.color);
//         p1.color = "Yellow";

//         BankAccount myAccount = new BankAccount();
//         myAccount.username = "ShariyaAsnari";
//         myAccount.setPassword("Hello");

//    }
}
// Acccess modifiers :- Demo
class BankAccount{
    public String username;

    // To access the private variable 
    private String password;

    // This is to set the password
    public void setPassword(String pwd){
        password = pwd;
        System.out.println(password);
    }

    
}



// Making a new cflass 
// Made a bluePrint of Pen
// class Pen1{
//     String color;
//     int tip;

//     void setColor(String newColor){
//         // When we get a new color in the argument we set it to the value of color
//         color = newColor;
//     }
    
//     void settip(int newTip){
//         tip = newTip;
//     }
// }

// class Student{
//     String name;
//     String age;
//     int percentage;
//     void calPercentage(int phy, int chem, int math){
//         percentage = (phy + chem + math)/3;
//     }
// }

