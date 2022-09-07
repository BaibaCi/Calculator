import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number x:");
        int x = scan.nextInt();

        System.out.println("Mathematical calculation of choice (+,-,*,/)?");
        Scanner extraScan = new Scanner(System.in);
        String mathematicalChoice = extraScan.nextLine();

        System.out.println("Please enter a number y:");
        int y = scan.nextInt();


        switch (mathematicalChoice) {
            case "+": {
                double a = x + y;
                System.out.println("The result is " + a);
                break;
            }
            case "-": {
                double b = x - y;
                System.out.println("The result is " + b);
                break;
            }
            case "*": {
                double c = x * y;
                System.out.println("The result is " + c);
                break;
            }
            case "/": {
                double d = x / y;
                System.out.println("The result is " + d);
                break;
            }
        }
    }
}



