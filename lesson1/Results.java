public class Results {
    public static void main(String[] args) {
        Player[] player = new Player[4];
        player[0] = new Player("Маша", 1000, 1000);
        player[1] = new Player("Петя", 1500, 800);
        player[2] = new Player("Миша", 900, 1500);
        player[3] = new Player("Настя", 950, 500);
        Team team = new Team("Ромашка", player);

        Course course = new Course(1000, 1000);
        String result = course.doIt(team);
        System.out.println(result);
    }
}

