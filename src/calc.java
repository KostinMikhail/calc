import java.util.Scanner;

public class calc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("первое число: ");
        int num = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("второе число: ");
        int num2 = in2.nextInt();

        Scanner scanner = new Scanner(System.in);
        System.out.print("знак операции: ");
        String symbol = scanner.nextLine();

        in.close();
        if(num2 == 0 && symbol.equals("/")){
            System.out.println("на ноль не делят");
            return;
        }
        int result = 0;


        if(symbol.equals("+")){
            result = num + num2;
        }
        if(symbol.equals("-")){
            result = num - num2;
        }
        if(symbol.equals("*")){
            result = num * num2;
        }
        if(symbol.equals("/")){
            result = num / num2;

        }
        System.out.printf("получилось %d", result);
    }

}
