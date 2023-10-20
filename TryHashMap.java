import java.util.*;
public class TryHashMap {
    public static void main(String[] var){
        HashMap<String,Integer> friends = new HashMap<>();
        friends.put("omkar",24);
        friends.put("rajan",24);
        friends.put("amol",23);
        friends.put("amol",25);
        friends.put(null,25);


        System.out.println(friends);

        friends.forEach((key,value)->{
            System.out.println(key+" "+value);
        });

        friends.remove(null);

        System.out.println(friends);

    }
}
