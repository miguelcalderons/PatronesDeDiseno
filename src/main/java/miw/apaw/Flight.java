package miw.apaw;

import java.time.LocalDateTime;

public class Flight {
    private String NoFlight;
    private LocalDateTime Date;
    private String Destination;

    public Flight(String NoFlight, String Destination){
        this.NoFlight = NoFlight;
        this.Date = LocalDateTime.now();
        this.Destination = Destination;
    }

    public void setFlightDate(LocalDateTime date) {
        this.Date = date;
    }

    public void setDestination(String destination) {
        this.Destination = destination;
    }

    public String getNoFlight() {
        return NoFlight;
    }

    public LocalDateTime GetTime() {
        return Date;
    }

    public String GetDestination() {
        return Destination;
    }
}
