package com.wozu.mySQLHerokuDemo.Services;

import com.wozu.mySQLHerokuDemo.Models.Dog;
import com.wozu.mySQLHerokuDemo.Repos.DogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    DogServiceImpl dogServiceImpl;
    @Override
    public void run(String... args) throws Exception {

        Dog dog1 = new Dog("dummy message 1", "SUCCESS");
        Dog dog2 = new Dog("dummy message 2", "SUCCESS");

        dogServiceImpl.postDogFromDogAPI(dog1);
        dogServiceImpl.postDogFromDogAPI(dog2);
    }
}