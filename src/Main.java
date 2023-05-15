import polymorfism.*;

public class Main {
    public static void main(String[] args) {
//        PersonRepository personRepositoryFile = new PersonRepositoryFile();

//        personRepositoryFile.savePerson(2, "Ion");

//        System.out.println(personRepositoryFile.getPersonNameById(2));
//        System.out.println(personRepositoryDB.getPersonNameById(1));


//        PersonRepository personRepositoryDB = new PersonRepositoryDB();
//        personRepositoryDB.savePerson(1, "Andrei");
//        personRepositoryDB.savePerson(2, "Vasile");
//
//        PersonService personService = new PersonService(personRepositoryDB);
//        int count = personService.countAllPerson();
//
//        System.out.println("Total persons: " + count);


        PersonRepository personRepositoryFile = new PersonRepositoryFile();
        personRepositoryFile.savePerson(1, "Andrei");
        personRepositoryFile.savePerson(2, "Vasile");

        PersonService personService = new PersonService(personRepositoryFile);
        int count = personService.countAllPerson();

        System.out.println("Total persons: " + count);


        AccountingService accountingService = new AccountingService(new PersonRepositoryFile());







    }
}