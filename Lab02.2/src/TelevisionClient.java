public class TelevisionClient {
    public static void main(String[] args) {
        //creating new instances
        Television tv1 = new Television();
        Television tv2 = new Television();
        Television tv3 = new Television();

        //calling methods on new instances

        tv1.brand = "Samsung";
        tv1.volume = 32;
        tv1.turnOn();

        tv2.brand = "Sony";
        tv2.volume = 24;
        tv2.turnOff();

        //when attributes are not set then values returned should
        //return null or zero values
        tv3.turnOff();
        tv3.turnOn();


    }
}
