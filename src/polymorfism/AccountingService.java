package polymorfism;

public class AccountingService {


    private PersonRepository personRepository;
    public AccountingService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    void calculateIncome() {
        personRepository.getAllPersonName(); // calculare venituri
    }

}
