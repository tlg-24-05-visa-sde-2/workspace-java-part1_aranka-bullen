/*
*Applicatuib or system to model the workings of a Televisiion.
* it has properties/attributes, it has business methos,
* but No main() methods
*/
class Television {
    //properties/attributes
    String brand;
    int volume;


    //functions/methods
    void turnOn() {
        System.out.printf("Turning on %s TV. Volume at %s.\n", brand, volume);
    }
    void turnOff() {
        System.out.printf("%s TV is shutting down\n", brand);
    }

}
