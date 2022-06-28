package cat;

public class Main {
    public static void main(String[] args) {

        Cat bloom = new Cat("Bloom", 2.5, 3.4,"gray",  0.5, "man");
        System.out.println(bloom.name);
        System.out.println(bloom.age);
        System.out.println(bloom.weight);
        System.out.println(bloom.color);
        System.out.println(bloom.length);
        System.out.println(bloom.gender);
        bloom = null;

        Cat fred = new Cat("Fred", 3, 2,"white",  0.4, "man");
        System.out.println(fred.name);
        System.out.println(fred.age);
        System.out.println(fred.weight);
        System.out.println(fred.color);
        System.out.println(fred.length);
        System.out.println(fred.gender);

    }
}
