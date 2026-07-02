public class Equals {
    public static void main(String[] args) {
//        String a = "Prince";
//        String b = "Prince";
//        System.out.println(a == b); //in this case it will give true ok

//case---2:
//        String a = new String("prince");
//        String b = new String("prince");    //remember new keyword always create new string
//        System.out.println(a == b);          //in this case it will give false ok and it always give us false we can;t that like that ok

//case---3: in above case we can't compare in java ok but with the help of this method we can compare ok
//        String a = new String("prince");
//        String b = new String("pnince");
//        System.out.println(a.charAt(1) == b.charAt(1));
//    }
//}
//case---4: at this stage equals joins the party ok
//        String a = new String("prince");
//        String b = new String("prince");
//        System.out.println(a.equals(b));
//  }

//now i will show you what equals did here with the help of creating a function:
//public class Equals{
//    public static boolean equals(String a, String b) {
//        if(a.length()!=b.length()) return false;
//        for(int i=0; i<a.length(); i++){
//            if(a.charAt(i)!=b.charAt(i)) return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        String a = new String("prince");
//        String b = new String("prince");
//        System.out.println(equals(a, b));
//    }
//}
