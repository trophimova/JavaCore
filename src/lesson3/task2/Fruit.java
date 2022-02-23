package lesson3.task2;

public abstract class Fruit {

    private String name;
    private Integer getWeight;

    public Fruit(String name, Integer getWeight) {
        this.name = name;
        this.getWeight = getWeight;
    }

    public String getName() {
        return name;
    }

    public Integer getGetWeight() {
        return getWeight;
    }
}
