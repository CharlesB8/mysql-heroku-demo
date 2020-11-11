package com.wozu.mySQLHerokuDemo.Controllers;

import com.wozu.mySQLHerokuDemo.Models.Dog;
import com.wozu.mySQLHerokuDemo.Services.DogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DogController {

    @Autowired
    DogServiceImpl dogServiceImpl;

    @GetMapping("/dogs")
    public Iterable<Dog> getAllDogs() {
        return dogServiceImpl.getAllDogs();
    }

    @PostMapping("/create/dog")
    public String createDog() {
        Dog dog = dogServiceImpl.getDogFromDogAPI();
        dogServiceImpl.postDogFromDogAPI(dog);
        return "Dog fetched";
    }

}
