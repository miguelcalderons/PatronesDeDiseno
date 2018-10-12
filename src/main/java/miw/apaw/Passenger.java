package miw.apaw;

public class Passenger {
    private String id;
    private String name;
    private String email;
    private Boolean firstClass;

    public Passenger(String id, String name, String email, boolean firstClass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.firstClass = firstClass;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setClass(Boolean firstClass) {
        this.firstClass = firstClass;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean getFirstClass() {
        return firstClass;
    }
}
