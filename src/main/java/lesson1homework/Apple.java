package lesson1homework;

public class Apple extends Fruit {
    private final float weight = 1.0f;

    public Apple(){;

    }
    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Apple { weight= %f } %s", weight, "string");
    }
}
