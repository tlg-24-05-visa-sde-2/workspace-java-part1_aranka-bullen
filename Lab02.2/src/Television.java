/*
*Application or system to model the workings of a Televisiion.
* it has properties/attributes, it has business methods,
* but No main() methods
*/
class Television {
    //properties/attributes
    private String brand;
    private int volume;
    boolean isConnected;



    //functions/methods
    public void turnOn() {
        isConnected = verifyInternetConnection();
        System.out.printf("Turning on %s TV. Volume at %s.\n", brand, volume);
    }
    public void turnOff() {
        System.out.printf("%s TV is shutting down\n", brand);
    }
    private boolean verifyInternetConnection(){
        return true;
    }


    //accessor methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString() {
        return String.format("Television: brand=%s, volume= %s.\n", brand, volume);
    }
}
