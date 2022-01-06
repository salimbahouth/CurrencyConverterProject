public class EUR extends Coin{
    final double value3 = 4.23;
    @Override
    public double getValue() {
        return value3;
    }

    @Override
    public double calculate(double input){
        return input*getValue();
    }
}
