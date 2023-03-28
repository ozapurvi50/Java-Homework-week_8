package ecaplsulation26;                                              //Package name

public class TestEncapsulation {                                      //Class name

    public static void main(String[] args) {                          //Main method
        Encapsulate obj = new Encapsulate();                         //setting values of the variables
        obj.setName("Amit");
        System.out.println("Prime's name : " + obj.getName());       // Print statement with calling method and entered value
        obj.setAge(19);
        System.out.println("Prime's age: " + obj.getAge());         // Print statement with calling method and entered value
        obj.setRollNo(51);
        System.out.println("Prime's rollNo : " + obj.getRollNo());   // Print statement with calling method and entered value








    }
}
