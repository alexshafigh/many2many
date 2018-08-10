import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Man {
    @Id
    @GeneratedValue
    private int ssn;

    @ManyToMany
    @JoinTable(name = "Owner_vehicles",
    joinColumns = @JoinColumn(name = "User_id"),
            inverseJoinColumns = @JoinColumn(name = "Vehicle_Number")
    )
    private Collection<Vehicle> vehicles = new ArrayList<Vehicle>();

    public Collection<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Collection<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
