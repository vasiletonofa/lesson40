package polymorfism;

public class PersonService {

    private PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public int countAllPerson() {
        return personRepository.getAllPersonName().size();
    }

}
