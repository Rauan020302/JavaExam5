package com.company.dao;

import com.company.model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class PersonDao {
    public static final HashMap<Long,Person> persons = new HashMap<>();
    static{
        Person p1 = Person.builder()
                .id(1L)
                .requestDateTime(new Date())
                .name("Harry")
                .birthYear(new Date())
                .gender("Male").build();
        persons.put(1L,p1);
    }
    public void getMessageFromPerson(Person person){
        if (person.getGender().equals("Male")){
            System.out.println("Уважаемый " + person.getName() + ", ваш год рождения " + person.getBirthYear() + ", вам " + (2021-person.getBirthYear().getYear()) + " лет");
        }else if (person.getGender().equals("Female")){
            System.out.println("Уважаемая " + person.getName() + ", ваш год рождения " + person.getBirthYear() + ", вам " + (2021-person.getBirthYear().getYear()) + " лет");
        }

    }
    public List<Person> getAllPersons(){
        return new ArrayList<>(persons.values());
    }
    public Person getPersonByName(String name){
        return persons.get(name);
    }
    public Person getPersonByBirthYear(Date date){
        return persons.get(date.getYear());
    }
    public Person getPersonByGender(String gender){
        return persons.get(gender);
    }
    public Person createPerson(Person person) {
        if (person.getBirthYear().getYear() < 2000) {
            return null;
        } else {
            persons.put(person.getId(), person);
            return persons.get(person.getId());
        }
    }

    public Person updatePerson(Person person){
        persons.put(person.getId(),person);
        return persons.get(person.getId());
    }
    public void deletePersonById(Long id){
        persons.remove(id);
    }

}
