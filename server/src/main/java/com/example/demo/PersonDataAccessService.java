package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao {


  @Override
  public UUID addPerson(UUID id, Person person) {
    return null;
  }

  @Override
  public List<Person> getPeople() {
    return List.of(new Person(UUID.randomUUID(), "FROM POSTGRES DB", 22));
  }

  @Override
  public Optional<Person> getPerson(UUID id) {
    return Optional.empty();
  }

  @Override
  public int deletePerson(UUID id) {
    return 0;
  }

  @Override
  public int updatePerson(UUID id, Person person) {
    return 0;
  }
}
