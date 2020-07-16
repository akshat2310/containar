import java.util.*;



public class CatsandDogs {
    public static void main(String[] args) {
        List cats = new ArrayList();
        for(int i = 0; i < 7; i++)
            cats.add(new cat(i));
        // Not a problem to add a dog to cats:
        cats.add(new Dog(7));
        for(int i = 0; i < cats.size(); i++)
            ((cat)cats.get(i)).id();
        // Dog is detected only at run time
    }
}
