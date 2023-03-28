package multilevelinheritance23;                                    //package name

class Testinheritance2 {                                           //class name
    public static void main(String[] args) {                       //main method
        BabyDog d = new BabyDog();
        d.weep();                                                   //method calling from another class
        d.bark();                                                   //method calling from another class
        d.eat();                                                    //method calling from another class
    }
}
