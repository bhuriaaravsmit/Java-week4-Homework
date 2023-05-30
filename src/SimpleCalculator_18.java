public class SimpleCalculator_18 {
    double firstNumber;
    double secondNumber;
    double c;

    public static void main(String[] args) {


        SimpleCalculator_18 cal = new SimpleCalculator_18();
        cal.setFirstNumber(5.0);
        cal.setSecondNumber(4);
        System.out.println("add = " + cal.getAdditionResult());
        System.out.println("subtract = " + cal.getSubtractionResult());
        cal.setFirstNumber(5.25);
        cal.setSecondNumber(0);
        System.out.println("multiply = " +cal.getMultiplicationResult());
        System.out.println("divide = " +cal.getDivisionResult());

    }

    public double getFirstNumber() {

return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;

    }

    public void setFirstNumber(double firstNumber) {
this.firstNumber =firstNumber;

    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber =secondNumber;

    }

    public double getAdditionResult() {


        c = firstNumber + secondNumber;
        return c;
    }

    public double getSubtractionResult() {

        c = firstNumber - secondNumber;
        return c;
    }

    public double getMultiplicationResult() {

        c = firstNumber * secondNumber;
        return c;
    }

    public double getDivisionResult() {
        c = firstNumber * secondNumber;
        return c;
    }


}
