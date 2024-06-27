class PrimitiveTest {
    public static void main(String[] args) {

        boolean isCloudy = true;
        System.out.println("isCloudy = " + isCloudy);

        double price = 1.50;
        System.out.println("price = " + price);

        int age = 57;
        System.out.println("age = " + age);

        long population = 8_000_000_000L;
        System.out.println("population = " + population);
        char size = 'S';
        System.out.println("size = " + size);

        String grade = "A";
        System.out.println("My grade on the test was an = " + grade);

        String quote = "Whats up, \"Doc\"";
        System.out.println("Bug's bunny says: " + quote);

        String poem = " Roses are red. \n Violets are blue.";
        System.out.println("Poem: " + poem);
        System.out.println();

        int n = 18;
        int m = n;
        n= 19;

        System.out.println("n is: " + n); // should take new value of 19
        System.out.println("m is: " + m); //should remain 18

        int kids = 2;
        System.out.println("kids is: " + kids++); //post-increment, increment occurs after operation, so kids is 2

    }
}