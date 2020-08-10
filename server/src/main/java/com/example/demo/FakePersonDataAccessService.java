package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


// This class needs to be instantiated as a bean so that it can be
// injected to other classes (PersonService).
// Can use @Component or @Repository. They are the same with respect to
// bean creation and dependency injection but later is a specialized form of former.
// Spring bean in the persistence layer should be annotated with @Repository annotation.
// For more info: https://javarevisited.blogspot.com/2017/11/difference-between-component-service.html

@Repository("fakeDao")
public class FakePersonDataAccessService implements PersonDao {

  private final static List<Person> DB = new ArrayList<>();

  @Override
  public List<Person> getPeople() {
    return DB;
  }

  @Override
  public UUID addPerson(UUID id, Person person) {
    DB.add(new Person(id, person.getName(), person.getAge()));
    return id;
  }

  @Override
  public Optional<Person> getPerson(UUID id) {
    return DB
        .stream()
        .filter(person -> person.getId().equals(id))
        .findFirst();
  }

  @Override
  public int deletePerson(UUID id) {
    Optional<Person> personOptional = getPerson(id);
    if (!personOptional.isPresent()) {
      return 0;
    }
    DB.remove(personOptional.get());
    return 1;
  }

  @Override
  public int updatePerson(UUID id, Person personUpdate) {
    return getPerson(id)
		// Get the person and map this person to something else
		// In this case, Optional<Integer> of 0 or 1.
		// https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html#map-java.util.function.Function-
        .map(person -> {
          int indexOfPersonToDelete = DB.indexOf(person);
          if (indexOfPersonToDelete >= 0) {
            DB.set(indexOfPersonToDelete, new Person(id, personUpdate.getName(), personUpdate.getAge()));
            return 1;
          }
          return 0;
        })
        .orElse(0);
  }
}
