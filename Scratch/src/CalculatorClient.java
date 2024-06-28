class CalculatorClient {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum = calculator.add(2,4);
        System.out.println(sum);

        int subtract = calculator.subtract(2,4);
        System.out.println(subtract);

        boolean evenNumbers = calculator.isEven(25);
        System.out.println(evenNumbers);
    }
}