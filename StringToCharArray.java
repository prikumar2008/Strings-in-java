public class StringToCharArray {
    public static void main(String[] args) {
        String s = "Prince Nisha";
        char[] arr = s.toCharArray();
        for (char ele : arr) {
            System.out.print(ele);
        }
    }
}
//point be noted: toCharArray() >>>>this written method called CamelCase method
//and : ToCharArray() >>>>>>>>>>>>>>this written method called PascalCase method
