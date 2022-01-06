public class ILS extends Coin{
    final double value1 = 0.28;

    @Override
        public double getValue(){

            return value1;
        }
        @Override
        public double calculate(double input){
            return input*getValue();
    }
}
