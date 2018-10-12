package miw.apaw.strategy;

public class China implements StrategyFlight {
    private String distance;

    public China(String distance) {
        this.distance = distance;
    }

    public void GetDistance() {
        System.out.println("La distancia de China es: " + distance);
    }
}
