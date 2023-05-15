package polymorfism;

import java.util.*;

public interface PersonRepository {

    String getPersonNameById(int id);

    void savePerson(int id, String name);

    List<String> getAllPersonName();

}
