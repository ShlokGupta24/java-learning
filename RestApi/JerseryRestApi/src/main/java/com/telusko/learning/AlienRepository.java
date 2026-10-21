package com.telusko.learning;

import java.util.ArrayList;
import java.util.List;
import java.sql.*; //To store data in MySQL db using mysql connector dependencies

//It is used to fetch the data from it to the main function file like AlienResource here in this case
public class AlienRepository {
List<Aliens> aliens;

Connection con=null;  //Connection object to create connection with mysql db and RESTApi
public AlienRepository(){ //Constructor to get values, as a mock data

//    aliens=new ArrayList<>();  //Creating a list of element using it.
//    Aliens a1=new Aliens();
//    a1.setId(101);
//    a1.setName("Shlok");
//    a1.setPoints(90);
//
//    Aliens a2=new Aliens();
//    a2.setId(102);
//    a2.setName("Sunil");
//    a2.setPoints(45);
//
//    aliens.add(a1);
//    aliens.add(a2);
    String url="jdbc:mysql://localhost/3306/restdb";
    String username="root";
    String password="0";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection(url, username, password);
    } catch (Exception e) {
        System.out.println(e);
    }
}

public List<Aliens> getAliens(){ //Use to the mock data in the constructor to get return as a list.

    return aliens;
}

public Aliens getAlien(int id){ //This is created to fetch the value at the particular id, like for id 101, we get Shlok and 90.
    for(Aliens a: aliens){
        if(a.getId()==id)
            return a;
    }
    return new Aliens();
}

    public void create(Aliens a1) {
    aliens.add(a1); //Adding the a1 data in the aliens
    }
}
