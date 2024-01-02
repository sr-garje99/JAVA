import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class CompareObjects {

    public static void main(String[] args){
        Person p1 = new Person("vijay",22);
        Person p2 = new Person("ajay",21);
        Person p3 = new Person("sujay",24);
        ArrayList<Person> pp = new ArrayList<>();
        pp.add(p1);
        pp.add(p2);
        pp.add(p3);
        System.out.println(pp);
        Collections.sort(pp);// sorts by age as comparable is implemented
        System.out.println(pp);
        // sorts by name as it implements comparator
        Collections.sort(pp,new CompareByName());
        System.out.println(pp);
        // sorts by name as it implements comparator
        pp.sort(new CompareByName());
        System.out.println(pp);

    }
}
class Person implements Comparable<Person>{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age =age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class CompareByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}
