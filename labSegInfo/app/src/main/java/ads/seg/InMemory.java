package ads.seg;

import java.util.ArrayList;
import java.util.HashMap;

public class InMemory implements UserRepository {
    HashMap<String,User> listaUsuarios = new HashMap<>();

    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User findByLogin(String login) {
        return null;
    }
}