class Calculator {

    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    boolean isEven(int value){
        return value % 2 == 0;
    }

    /*
    * Returns a random interger between 1 and 11 (inclusively)
    *
    * HINT: see a class called MATH (in a package java.lang)
    * NOTE these methods are all "static," which mean you call them as
    * follows:
    *   Math.methodName()
    *
    *
    * */
    int randomInt(int min, int max){
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}