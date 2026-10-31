package in.learning;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Alien_data")
public class Alien {
    @Id
    @Column(name="a_id")
    private int id;
    @Column(name="a_name")
    private String name;
    private String tech;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", tech='" + tech + '\'' +
                '}';
    }
}
