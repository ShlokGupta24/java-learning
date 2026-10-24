package com.telusko.learning;

import java.util.ArrayList;
import java.util.List;
import java.sql.*; //To store data in MySQL db using mysql connector dependencies

//It is used to fetch the data from it to the main function file like AlienResource here in this case
public class AlienRepository {
//List<Aliens> aliens;

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
    String url="jdbc:mysql://localhost:3306/restdb";
    String username="root";
    String password="24june2005";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con= DriverManager.getConnection(url, username, password);
        System.out.println("MySQL connected successfully!");
    } catch (Exception e) {
        System.err.println("Failed to connect to MySQL:");
        e.printStackTrace();
        throw new RuntimeException("Database connection failed", e);
    }
}

public List<Aliens> getAliens(){ //Use to the mock data in the constructor to get return as a list.
List <Aliens> aliens= new ArrayList<>();
String sql="SELECT * FROM ALIEN";
    try {
        //JDBC Learning part, just getting the value in the MySQL Database
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
            Aliens a =new Aliens();
            a.setId(rs.getInt(1));
            a.setName(rs.getString(2));
            a.setPoints(rs.getInt(3));

            aliens.add(a);
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
    return aliens;
}

public Aliens getAlien(int id){ //This is created to fetch the value at the particular id, like for id 101, we get Shlok and 90.
//    for(Aliens a: aliens){
//        if(a.getId()==id)
//            return a;
//    }

    List <Aliens> aliens= new ArrayList<>();
    String sql="SELECT * FROM ALIEN WHERE ID="+id;
    Aliens a =new Aliens();
    try {
        //JDBC Learning part, just getting the value in the MySQL Database
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        if(rs.next()){

            a.setId(rs.getInt(1));
            a.setName(rs.getString(2));
            a.setPoints(rs.getInt(3));
        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }

    return a;
}

    public void create(Aliens a1) {
    //aliens.add(a1); //Adding the a1 data in the aliens
        String sql="INSERT INTO ALIEN VALUES (?,?,?)";
        try {
            //JDBC Learning part, just getting the value in the MySQL Database
            PreparedStatement st= con.prepareStatement(sql);
            st.setInt(1,a1.getId());
            st.setString(2, a1.getName());
            st.setInt(3, a1.getPoints());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(Aliens a1) {
        String sql="UPDATE ALIEN SET name=?, points=? WHERE id=?";
        try {
            //JDBC Learning part, just getting the value in the MySQL Database
            PreparedStatement st= con.prepareStatement(sql);
            st.setString(1, a1.getName());
            st.setInt(2, a1.getPoints());
            st.setInt(3,a1.getId());

            st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id) {
        String sql="DELETE FROM ALIEN WHERE ID=?";
        try {
            //JDBC Learning part, just getting the value in the MySQL Database
            PreparedStatement st= con.prepareStatement(sql);
            st.setInt(1,id);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
