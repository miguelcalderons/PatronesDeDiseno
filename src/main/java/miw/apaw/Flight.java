package miw.apaw;

import java.time.LocalDateTime;

public class Flight {
    private String noFlight;
    private LocalDateTime date;
    private String destination;

    enum Weather {sunny, windy, rainy };

    private Weather weather;

    public Flight(String noFlight, String destination, Weather weather){
        this.noFlight = noFlight;
        this.date = LocalDateTime.now();
        this.destination = destination;
        this.weather = weather;
    }

    public void setFlightDate(LocalDateTime date) {
        this.date = date;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getNoFlight() {
        return noFlight;
    }

    public Weather getWeather() {
        return weather;
    }

    public LocalDateTime getTime() {
        return date;
    }

    public String getDestination() {
        return destination;
    }
}
