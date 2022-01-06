import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.awt.Desktop;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {



    Scanner usrInput = new Scanner(System.in);
        System.out.println("Welcome to currency converter \n Please choose an option (1/2/3)");


        char choice;
        do{
                System.out.println("1.Dollars to Shekels \n2.Shekels to Dollars \n3.Shekels to EUR");
                int userAnswer = usrInput.nextInt();

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
                        myWriter.write("The result of the currency program:\n");
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
                        myWriter.write("The result of the currency program:\n");
                        myWriter.write(String.valueOf(myList1));
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }

                case 3:

                    System.out.println("Please enter an amount to convert. (ILS to EUR Only)");
                    double eurAmount = usrInput.nextDouble();
                    double value3 = new EUR().calculate(eurAmount);
                    System.out.println(value3);

                    //creating list to save the result into it
                    ArrayList<Double> myList2= new ArrayList<Double>();
                    myList2.add(value3);//print the result in arraylist
                    //save the result arraylist in a file named result
                    try {
                        FileWriter myWriter = new FileWriter("result.txt");
                        myWriter.write("The result of the currency program:\n");
                        myWriter.write(String.valueOf(myList2));
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;
            }



            System.out.println("Do you want to start over? Y/N");
                choice=usrInput.next().charAt(0);

            if(choice == 'N' || choice == 'n'){
                System.out.println("Thanks for using our currency converter.");
                String filePath = "result.txt";
                //get the file content and print it
                String content = new String(Files.readAllBytes(Paths.get(filePath)));
                System.out.println(content);

//                -------- open file result ----------
                try
                {
//constructor of file class having file as argument
                    File file = new File("result.txt");
                    if(!Desktop.isDesktopSupported())//check if Desktop is supported by Platform or not
                    {
                        System.out.println("not supported");
                        return;
                    }
                    Desktop desktop = Desktop.getDesktop();
                    if(file.exists())         //checks file exists or not
                        desktop.open(file);              //opens the specified file
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
//            ------- open file result ----------


                break;

            }

        }while(choice == 'Y' || choice == 'y');

    }


}
