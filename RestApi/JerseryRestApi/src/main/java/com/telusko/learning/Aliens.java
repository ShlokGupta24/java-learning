package com.telusko.learning;

import jakarta.xml.bind.annotation.XmlRootElement;

 @XmlRootElement  //To get an xml file from the data of name and points.
 public class Aliens {
  private String name;
  private int points;
  private int id;
     // No-argument constructor
     public Aliens() {
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
