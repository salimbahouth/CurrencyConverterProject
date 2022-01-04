import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner usrInput = new Scanner(System.in);
        System.out.println("Welcome to currency converter \n Please choose an option (1/2)");
        System.out.println("1.Dollars to Shekels \n2.Shekels to Dollars");
        int userAnswer = usrInput.nextInt();
        char choice;

        do{
            switch (userAnswer) {
                case 1:

                    System.out.println("Please enter an amount to convert");
                    double usdAmount = usrInput.nextDouble();
                    double value = new USD().calculate(usdAmount);
                    System.out.println(value);

                    //creating list to save the result into it
                    ArrayList<Double> myList= new ArrayList<Double>();
                    myList.add(value);//print the result in arraylist
                    //save the result arraylist in a file named result
                    try {
                        FileWriter myWriter = new FileWriter("result.txt");
                        myWriter.write(String.valueOf(myList));
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;


                case 2:
                    System.out.println("Please enter an amount to convert");
                    double ilsAmount = usrInput.nextDouble(); // input from the user
                    double value1 = new ILS().calculate(ilsAmount); // call the calculate function in ILS class
                    System.out.println(value1);

                    //creating list to save the result into it
                    ArrayList<Double> myList1= new ArrayList<Double>();
                    myList1.add(value1); //print the result in arraylist
                    //save the result arraylist in a file named result
                    try {
                        FileWriter myWriter = new FileWriter("result.txt");
                        myWriter.write(String.valueOf(myList1));
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }

            }

            System.out.println("Do you want to start over? Y/N");
                choice=usrInput.next().charAt(0);

            if(choice == 'N' || choice == 'n'){
                System.out.println("Thanks for using our currency converter.");
                break;
            }
        }while(choice == 'Y' || choice == 'y');




    }

}
