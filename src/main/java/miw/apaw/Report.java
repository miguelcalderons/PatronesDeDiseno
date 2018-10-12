package miw.apaw;

public class Report {
    private String id;
    private String Message;
    private Boolean safeLanding;

    public Report(String Message, String Id) {
        this.id = Id;
        this.Message = Message;
        this.safeLanding = true;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }
    public void setSafeLanding(Boolean safeLanding) {
        this.safeLanding = safeLanding;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return Message;
    }

    public boolean getSafeLanding() {
        return safeLanding;
    }
}
