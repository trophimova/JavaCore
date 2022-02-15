public class Player {

    private String name;
    private int runLimit;
    private int swimLimit;

    public Player(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public String getName() {
        return name;
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }
}
