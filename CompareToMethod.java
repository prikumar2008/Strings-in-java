//public class CompareToMethod
//{
//    public static void main(String[] args) {
//        String a = "prince";
//        String b = "nisha";
//        System.out.println(a.compareTo(b));//sabse pahele first char dekega and compare karega
//    }
//}


//Same class again>>>>

//public class CompareToMethod{
//    public static int CompareTo(String a, String b){
//        String[] c = new String[a.length()];
//        String[] c1 = new String[b.length()];
//        int i, j;
//        for( i = 0; i < a.length()-1; i++){
//            c[i] = a.charAt(i) + "";
//
//        }
//        for( j = 0; j < b.length()-1; j++){
//            c1[j] = b.charAt(j) + "";
//        }
//        if(c[i].equals(c1[j])) {
//            return i;
//        }
//        else if(c[i].compareTo(c1[j])){
//            return i;
//        }
//        else{
//            return j;
//        }


//Same class third time used here>>>>>>

public class CompareToMethod {
    public static int CompareTo(String a, String b) {
        int n = Math.min(a.length(), b.length());

        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return a.charAt(i) - b.charAt(i);
            }
        }
        return a.length() - b.length();
    }

}
    public static void main(String[] args) {
        String a = "prince";
        String b = "nisha";
        System.out.println(CompareToMethod.CompareTo(a,b));
    }
