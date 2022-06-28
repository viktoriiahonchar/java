package humanoid;
public class Main {
    public static void main(String[] args) {

        Human viktoria = new Human("Viktoria", 33,1.63);
        System.out.println(viktoria.fullName);
        System.out.println(viktoria.age);
        System.out.println(viktoria.height);

        viktoria = null;

        Human viktor = new Human("Viktor", 35, 1.8);
        System.out.println(viktor.fullName);
        System.out.println(viktor.age);
        System.out.println(viktor.height);

    }
}
