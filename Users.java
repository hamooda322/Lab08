public class Users {
private String name;
private String location;

public String getName() {
    return name;
}

public void setName (String name) {
    this.location = name;
}
    public String getLocation() {
        return location;
    }

    public void setLocation (String location) {
        this.location = location;
    }
public Users (String name, String location) {
    this.name = name;
    this.location = location;
}
public Users (String name){
    this.name = name;
    this.location = "location not set!";
}

}
