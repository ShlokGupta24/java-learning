package com.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlienResource {
    //We don't have to create object using new, by using Autowired Annotation, it can search for the implementation and give us the object.
    @Autowired
    AlienRepository repo;

    @GetMapping("aliens")
    public List<Alien> getAlien(){
    List<Alien> aliens= (List<Alien>) repo.findAll(); //Fetching all the data from DB and stored in alien list.
//We don't need to manually add the data, we have connected it to DB, so we just fetch from DB.
//    Alien a1=new Alien();
//    a1.setId(101);
//    a1.setName("Rahul");
//    a1.setPoints(80);
//
//        Alien a2=new Alien();
//        a2.setId(102);
//        a2.setName("Karan");
//        a2.setPoints(60);
//
//        aliens.add(a1);
//        aliens.add(a2);

    return aliens;
    }
}
