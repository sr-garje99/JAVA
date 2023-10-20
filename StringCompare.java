public class StringCompare {

    public static void main(String[] args){
        String s1 ="abc";
        String s2 ="abc";
        String s3 = "dbc";
        String s4 = new String("abc");
        String s5 = new String("abc");

           System.out.println("String objects " + s4 == s5);

            System.out.println("String pool same "+ s1 == s2);
        System.out.println("String pool diff "+ s1 == s3);


            System.out.println("String literal to object ");


    }
}
