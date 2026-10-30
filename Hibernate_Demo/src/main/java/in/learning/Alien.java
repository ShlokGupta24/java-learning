package in.learning;

import jakarta.persistence.Entity;

@Entity
public class Alien {
    private String name;
    private int id;
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
