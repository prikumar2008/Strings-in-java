public class SubString {
    public static void main(String[] args) {
        String s = "PrinceNisha";
//        System.out.println(s.substring(0));
//        System.out.println(s.substring(6));
//        System.out.println(s.substring(0,s.length()-1));
//
//        //System.out.println(s.substring(10,0));        //we can't do that if we want to print it reverse then we can use loop.
//
//        for(int i=10; i>=0;i--){
//            System.out.print(s.charAt(i));
//        }
//        System.out.println();
//
////Important.>>>
//        //print all substrings in the string>>>
        for(int i=0; i<s.length();i++){
            for(int j=i; j<s.length();j++){     //it could be also j=i+1
                System.out.print(s.substring(i,j+1)+" ");// when above comment could be correct then(i,j)
            }
            System.out.println(s.substring(s.length()));
            System.out.println();
        }
    }
}
