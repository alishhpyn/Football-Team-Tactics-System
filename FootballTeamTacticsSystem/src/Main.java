public class Main {
    public static void main(String[] args) {
        FootballTeam team = new FootballTeam();

        team.setStrategy(new AttackingStrategy());
        team.play();

        team.setStrategy(new DefensiveStrategy());
        team.play();

        team.setStrategy(new CounterAttackStrategy());
        team.play();
    }
}