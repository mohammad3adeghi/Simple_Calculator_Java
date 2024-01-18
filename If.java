import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner inputNums = new Scanner(System.in);

        System.out.println("Enter The Num1: ");
        double num1 = inputNums.nextDouble();

        System.out.println("Enter The Operation (+,-,*,/): ");
        char opt = inputNums.next().charAt(0);

        System.out.println("Enter The Num2: ");
        double num2 = inputNums.nextDouble();

        double plusResult = num1 + num2;
        double minesResult = num1 - num2;
        double multipleResult = num1 * num2;
        double divitionResult = num1 / num2;

        if (opt == '+') {
            System.out.println(num1 + " + " + num2 + " = " + plusResult);
        } else if (opt == '-') {
            System.out.println(num1 + " - " + num2 + " = " + minesResult);
        } else if (opt == '*') {
            System.out.println(num1 + " * " + num2 + " = " + multipleResult);
        } else if (opt == '/') {
            System.out.println(num1 + " / " + num2 + " = " + divitionResult);
        } else {
            System.out.println("This Operation Is Not Invalid");

            System.out.println("Please Enter The Operation Again (+,-,*,/): ");
            opt = inputNums.next().charAt(0);

            if (opt == '+') {
                System.out.println(num1 + " + " + num2 + " = " + plusResult);
            } else if (opt == '-') {
                System.out.println(num1 + " - " + num2 + " = " + minesResult);
            } else if (opt == '*') {
                System.out.println(num1 + " * " + num2 + " = " + multipleResult);
            } else if (opt == '/') {
                System.out.println(num1 + " / " + num2 + " = " + divitionResult);
            } else {
                System.out.println("This Operation Is Not Invalid");
                opt = inputNums.next().charAt(0);
            }

        }
    }
}