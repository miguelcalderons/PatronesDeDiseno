package miw.apaw.strategy;

public class USA implements StrategyFlight {
    private String distance;

    public USA(String distance) {
        this.distance = distance;
    }

    public void GetDistance() {
        System.out.println("La distancia de USA es: " + distance);
    }
}
