package miw.apaw;

public class Report {
    private String id;
    private String message;
    private Boolean safeLanding;

    public Report(String message, String id) {
        this.id = id;
        this.message = message;
        this.safeLanding = true;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMessage(String Message) {
        this.message = Message;
    }
    public void setSafeLanding(Boolean safeLanding) {
        this.safeLanding = safeLanding;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public boolean getSafeLanding() {
        return safeLanding;
    }
}
