import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {


    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);

    }

    private static int divide(){
        int x = getInt();
        int y = getInt();
        System.out.println("x is "+x +" and y is "+y);
        return x/y;
    }

    private static int getInt(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        while(true){
            try{
                return sc.nextInt();
            }catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Please enter a number only the digits 0 to 9");
            }
        }

    }
}
