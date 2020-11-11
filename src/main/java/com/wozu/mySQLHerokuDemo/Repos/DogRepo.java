package com.wozu.mySQLHerokuDemo.Repos;

import com.wozu.mySQLHerokuDemo.Models.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends CrudRepository<Dog, Long> {}
