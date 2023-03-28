package methodoverriding24;                                    // Package name
//Test class to create objects and call the methods
class Test2 {                                                  //Class name

    public static void main(String[] args) {                  //Main method

        SBI s = new SBI();                                    //Variable defined  for methods
        ICICI i = new ICICI();                                //Variable defined  for methods
        AXIS a = new AXIS();                                  //Variable defined  for methods

        System.out.println("SBI Rate of Interest " + s.getRateOfInterest());     //Print statement with method value
        System.out.println("ICICI Rate of Interest " + i.getRateOfInterest());    //Print statement with method value
        System.out.println("AXIS Rate of Interest " + a.getRateOfInterest());     //Print statement with method value

    }

}
