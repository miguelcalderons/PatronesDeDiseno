package miw.apaw.strategy;

public class FlightDistance {
    private StrategyFlight strategyFlight;
    private String distance;

    public FlightDistance(String distance) {
        this.distance = distance;
    }

    public void setStrategy(StrategyFlight strategy) {
        this.strategyFlight = strategy;
    }

    public void Distance() {
        strategyFlight.GetDistance();
    }
}
