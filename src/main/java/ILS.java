public class ILS extends Coin{
    final double value1 = 3.52;

    @Override
        public double getValue(){

            return value1;
        }
        @Override
        public double calculate(double input){
            return input/getValue();
    }
}
