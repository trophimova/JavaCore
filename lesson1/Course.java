public class Course {
    String result;
    private int runDistance;
    private int swimDistance;

    public Course(int runDistance, int swimDistance) {
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public String doIt(Team team) {
        result = "Команда: " + team.getName() +  " " + '\n';
        for(Player player: team.getPlayers()) {
            result += "Имя участника: " + player.getName() + " " + '\n';
            int runValue = player.getRunLimit();
            testRunDistance(runValue);
            int swimValue = player.getSwimLimit();
            testSwimDistance(swimValue);
        }
        return result;
    }

    private Course testRunDistance(int runValue) {
        if(runValue<runDistance) result += "Беговая дистанция на " + runDistance + " метров не преодолена" + '\n';
        else result += "Беговая дистанция на " + runDistance + " метров преодолена" + '\n';
        return this;
    }

    private Course testSwimDistance(int swimValue) {
        if(swimValue<swimDistance) result += "Дистанция по плаванию на " + swimDistance + " метров не преодолена" + '\n';
        else result += "Дистанция по плаванию на " + swimDistance + " метров преодолена" + '\n';
        return this;
    }
}
