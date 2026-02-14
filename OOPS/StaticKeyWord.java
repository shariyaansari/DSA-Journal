// package OOPS;

// public class StaticKeyWord {
//     public static void main(String[] args) {
//         SchoolStudents mySchoolStudents = new SchoolStudents();
//         // Once I declare this School Name here then it will stay the same for the rest of the objects as well.
//         mySchoolStudents.schoolName = "PSH";
        
//         // Let's see whether it stays the same or not by making another object and printing in it.
//         SchoolStudents mySchoolStudents2 = new SchoolStudents();
//         System.out.println(mySchoolStudents2.schoolName);
//         // For this the name of the school for student got printed
        
//         // Now suppose I make another object and change the school name of that student then the school name for other objects will change as well
//         SchoolStudents mySchoolStudents3 = new SchoolStudents();
//         mySchoolStudents3.schoolName = "AKEHS";
//         System.out.println(mySchoolStudents.schoolName);
//         System.out.println(mySchoolStudents2.schoolName);
//         System.out.println(mySchoolStudents3.schoolName);
//     }
// }

// class SchoolStudents{
//     // This function will only get created once in the memory since it's static 
//     static int returnPercentage(int math, int phy, int chem){
//         return (math+phy+chem);
//     }

//     String name;
//     int roll;
//     // This is stay same throughout the code 
//     static String schoolName;

//     void setName(String name){
//         this.name = name;
//     }
//     String getName(){
//         return name;
//     }
// }
