import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //it could be a method ok
//        System.out.print("Enter a string: ");
//        String s = input.nextLine();
//        System.out.print(s +" " + s.length());
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        String s = " "+ n;
        System.out.println(s.length());
    }
}
