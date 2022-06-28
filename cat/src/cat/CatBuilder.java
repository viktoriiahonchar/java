package cat;

public class CatBuilder {
    private String name;
    private double age;

    private double weight;

    private String color;

    private double length;

    private String gender;

    public CatBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CatBuilder setAge(double age) {
        this.age = age;
        return this;
    }


    public CatBuilder setWeight(double weight) {
      this.weight = weight;
      return this;
    }

    public CatBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CatBuilder setLength(double length) {
        this.length = length;
        return this;
    }

    public CatBuilder setGender(String name) {
        this.gender = gender;
        return this;
    }

    }