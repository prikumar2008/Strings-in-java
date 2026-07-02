import java.util.Scanner;
public class IntToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scan.nextInt();

        //it's a inbuilt function ok
        //String b = Integer.toString(a);
        //System.out.println(b);

        String s = " ";
        s= s+a;
        System.out.println(s);

    }
}
