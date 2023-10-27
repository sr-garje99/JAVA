import java.util.*;
public class TryCollection {
    public static void main(String[] args){
        List <String> city = new ArrayList<>();
        city.add("pune");
        city.add("delhi");
        city.add("latur");
        //city.sort();
        System.out.println(city);
        System.out.println(city.get(2));
        System.out.println(city.contains("latur"));
        System.out.println(city.size());
        System.out.println(city.remove("delhi") );
        System.out.println(city);
        city.add(0,"delhi");
        System.out.println(city);

        List<String> ll =new LinkedList<>(city);
        //ll.addAll(city);
        Vector<String> v =new Vector<>(city);
        System.out.println(ll);
        System.out.println(v);
        city.removeAll(v);
        city.addAll(ll);
        //city.clear();
        city.set(0,"agra");
        System.out.println(city);

        HashSet<String> ct = new HashSet<>(city);
        System.out.println(ct);
        ct.add("agra");
        System.out.println(ct);
        Collections.sort(city);
        System.out.println(city);
        city.sort(new CompareByA());
        System.out.println(city);
        ct.add("mumbai");

        TreeSet<String> ts = new TreeSet<>(ct);
        System.out.println(ts);

        for(String s:ts){
            System.out.println(s);
        };

        Iterator<String> itr = ts.iterator();
        while(itr.hasNext()){
            String nxt = itr.next();
            System.out.println(nxt);
        }
        ListIterator<String> litr = city.listIterator(city.size());
        while(litr.hasPrevious()){
            String nxt = litr.previous();
            System.out.println(nxt);
        }
        System.out.println(city.size());
        ts.forEach(c->{
            System.out.println(c);
        });

    }
}
class CompareByA implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
