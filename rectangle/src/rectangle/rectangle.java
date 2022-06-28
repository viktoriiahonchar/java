package rectangle;

public class rectangle {
    String colour;
    static double length;
    static double height;
    double perimeter;
    double place;
    double sense;
    double diagonal;

    String rectangleBest;

    public rectangle(String colour, double length, double height) {
        this.colour = colour;
        this.length = length;
        this.height = height;
    }

    public rectangle(double perimeter,double place) {
        this.perimeter = perimeter;
        this.place = place;
    }

    public rectangle(int sense){
        this.sense = sense;
    }
    public rectangle(double diagonal){
        this.diagonal = diagonal;
    }
    public rectangle(String rectangleBest){
        this.rectangleBest = rectangleBest;
    }
}