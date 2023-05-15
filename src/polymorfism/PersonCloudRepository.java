package polymorfism;

import java.util.List;

public class PersonCloudRepository implements PersonRepository {
    @Override
    public String getPersonNameById(int id) {
        return null;
    }

    @Override
    public void savePerson(int id, String name) {

    }

    @Override
    public List<String> getAllPersonName() {
        return null;
    }
}
