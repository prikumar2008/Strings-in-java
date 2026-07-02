public class PassingStringToMethod {
    public static void change(String x){
        x = "prince";
    }
    public static void main(String[] args) {
        String x = "nisha";
        System.out.println(x);     //passing to the method;
        //x = x.toUpperCase();
        //x = "prince";
        change(x);
        System.out.println(x);
    }
}
