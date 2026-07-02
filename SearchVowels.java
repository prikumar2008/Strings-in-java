public class SearchVowels {
    public static void main(String[] args) {
        String v = "imjijvdididmjiekinrnrbuediejie";
        int count = 0;
        char ch;
        for(int i = 0; i < v.length(); i++){
             ch = v.charAt(i);
            if(ch=='a'|| ch=='e'|| ch =='i' || ch =='o'|| ch =='u'){
                count++;
                System.out.print(ch+" ");
            }

        }


        System.out.println();
        System.out.print(count);

    }
}
