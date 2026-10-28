package com.telusko;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement  //To get an xml file from the data of name and points.
@Entity  //Make this Alien class as entity concept of hibernate for CrudRepository interface in AlienRepository.java file
public class Alien {
 private String name;
 private int points;
 @Id //ID is the primary key for the CrudRepository in AlienRepository.java file.
 private int id;
    // No-argument constructor
    public Alien() {

    }
   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public int getPoints() {
       return points;
   }

   public void setPoints(int points) {
       this.points = points;
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Aliens{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", id=" + id +
                '}';
    }
}
