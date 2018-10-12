package miw.apaw;

import java.time.LocalDateTime;

public class Flight {
    private String NoFlight;
    private LocalDateTime Date;
    private String Destination;

    enum Weather {Sunny, Windy, Rainy };

    public Weather weather;
    public Flight(String NoFlight, String Destination, Weather weather){
        this.NoFlight = NoFlight;
        this.Date = LocalDateTime.now();
        this.Destination = Destination;
        this.weather = weather;
    }

    public void setFlightDate(LocalDateTime date) {
        this.Date = date;
    }

    public void setDestination(String destination) {
        this.Destination = destination;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String getNoFlight() {
        return NoFlight;
    }

    public Weather getWeather() {
        return weather;
    }

    public LocalDateTime GetTime() {
        return Date;
    }

    public String GetDestination() {
        return Destination;
    }
}
