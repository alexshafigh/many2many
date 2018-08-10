import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Vehicle {
    private String name;
    @Id
    private int number;

    @ManyToMany(mappedBy = "vehicles")
    private Collection<Man> owners = new ArrayList<Man>();

    public Collection<Man> getOwners() {
        return owners;
    }

    public void setOwners(Collection<Man> owners) {
        this.owners = owners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
