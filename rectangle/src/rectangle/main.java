package rectangle;
public class main {
    public static void main(String[] args) {
        rectangle rectangle= new rectangle("black", 15, 3);
        rectangle.perimeter = ((rectangle.length+rectangle.height)*2);
        rectangle.place = (rectangle.length*rectangle.height);
        rectangle.sense = rectangle.perimeter;
        rectangle.diagonal =  Math.sqrt((rectangle.height*rectangle.height)+(rectangle.length*rectangle.length));
        String rectangleBest = "rectangleBest";
        System.out.println(rectangle.colour);
        System.out.println(rectangle.length);
        System.out.println(rectangle.height);
        System.out.println(rectangle.perimeter);
        System.out.println(rectangle.place);
        System.out.println(rectangle.sense);
        System.out.println(rectangle.diagonal);
        System.out.println("rectangleBest");
    }
}