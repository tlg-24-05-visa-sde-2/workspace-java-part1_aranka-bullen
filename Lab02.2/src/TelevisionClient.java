public class TelevisionClient {
    public static void main(String[] args) {
        //creating new instances
        Television tv1 = new Television();
        Television tv2 = new Television();
        Television tv3 = new Television();

        //calling methods on new instances

        tv1.setBrand("Samsung");
        tv1.setVolume(32);
        tv1.turnOn();
        System.out.println(tv1);

        tv2.setBrand("Sony");
        tv2.setVolume(24);
        tv2.turnOff();
        System.out.println(tv2);

        //when attributes are not set then values returned should
        //return null or zero values
        tv3.turnOff();
        tv3.turnOn();
        System.out.println(tv3);
        System.out.println(tv3.isConnected);

    }
}
