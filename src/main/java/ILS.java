public class ILS extends Coin{
    final double value = 0.28;

        public double getValue(){
            calculate(value);

            System.out.println("hello");
            return value;
        }
    public double calculate(double input){
        return input/getValue();
    }
}
