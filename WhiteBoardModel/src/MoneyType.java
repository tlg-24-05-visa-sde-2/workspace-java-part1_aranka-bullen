enum MoneyType {
    PENNY(0.01),
    NICKEL(.05),
    DIME(.10),
    QUARTER(.25),
    DOLLAR(1.00),
    FIVE_DOLLAR(5.00),
    TEN_DOLLAR(10.00),
    TWENTY_DOLLAR(20.00);

    double value;

    MoneyType(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
}