public class FootballTeam {
    private TacticStrategy strategy;

    public void setStrategy(TacticStrategy strategy) {
        this.strategy = strategy;
    }

    public void play() {
        strategy.execute();
    }
}