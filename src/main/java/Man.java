import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@NamedNativeQuery(name = "getAllUsers" ,
query = "select * from Man where name = :soosa ",
        resultClass = Man.class
)




@Entity
public class Man {
    @Id @GeneratedValue
    private int ssn;

    private String name;

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

}
