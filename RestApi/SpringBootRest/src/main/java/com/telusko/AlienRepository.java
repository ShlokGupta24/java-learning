package com.telusko;

import org.springframework.data.repository.CrudRepository;

//We create this interface to fetch the data from restdb MYSQL DB.
//We use CrudRepository to get the interface know about the class and datatype of primary key which is Alien and datatype of ID that we provide for each alien, is to use to fetch the data from DB.
public interface AlienRepository extends CrudRepository<Alien, Integer> {
 //The beauty of Spring, we didn't to write any code for fetching the data from DB just the CrudRepository did it work to fetch the data.
}
