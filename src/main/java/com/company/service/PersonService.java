package com.company.service;

import com.company.dao.PersonDao;
import com.company.model.Person;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;
import java.util.List;

@Path("/persons")
public class PersonService {
    private final PersonDao personDao = new PersonDao();
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Person> getAllPersons(){
        return personDao.getAllPersons();
    }
    @GET
    @Path("/{personId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void getMessageFromPersons(Person person){
        personDao.getMessageFromPerson(person);
    }
    @GET
    @Path("/{personName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonByName(@PathParam("personName") String name){
        return personDao.getPersonByName(name);
    }
    @GET
    @Path("/{personDate}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonByBirthYear(@PathParam("personDate") Date date ){
        return personDao.getPersonByBirthYear(date);
    }
    @GET
    @Path("/{personGender}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonByBirthYear(@PathParam("personGender") String gender ){
        return personDao.getPersonByGender(gender);
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Person createPerson(Person person){
        return personDao.createPerson(person);
    }
    @PUT
    @Path("/{personId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person updatePerson(Person person ){
        return personDao.updatePerson(person);
    }
    @DELETE
    @Path("/{personId}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deletePerson(@PathParam("personId") Long personId){
        personDao.deletePersonById(personId);
    }
}
