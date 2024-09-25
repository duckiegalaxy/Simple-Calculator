import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);
        System.out.println("enter the first number:");
            double FirstNumber = Number.nextInt();
        System.out.println("enter the 2nd number");
            double SecNumber = Number.nextInt();
        System.out.println("pick the operation + , - , x , / , % , sqrt");
         String operation = Number.next();
        if (operation.equals("/") && SecNumber == 0) {
            System.out.println("Arthimetic error");
        } else if (operation.equals("+")) {
            double result = FirstNumber + SecNumber;
            System.out.println(result);
        } else if (operation.equals("-")) {
            double result = FirstNumber - SecNumber;
            System.out.println(result);
        } else if (operation.equals("x")) {
            double result = FirstNumber * SecNumber;
            System.out.println(result);
        } else if (operation.equals("%")) {
            double result = FirstNumber % SecNumber;
            System.out.println(result);
        } else {
            double result = FirstNumber / SecNumber;
            System.out.printf("%.2f", result);
        }


    }}