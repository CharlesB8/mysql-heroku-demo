package com.wozu.mySQLHerokuDemo.Services;

import com.wozu.mySQLHerokuDemo.Models.Dog;

public interface DogService {
    public Dog getDogFromDogAPI();
    public void postDogFromDogAPI(Dog dog);
    public Iterable<Dog> getAllDogs();
}
