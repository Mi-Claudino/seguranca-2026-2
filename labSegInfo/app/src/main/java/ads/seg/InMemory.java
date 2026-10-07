package ads.seg;

import java.util.ArrayList;
import java.util.HashMap;

public class InMemory implements UserRepository {
    HashMap<String,User> mapsUsuarios = new HashMap<>();

    @Override
    public boolean save(User user) {
        if(user.getUser().equals(mapsUsuarios.get(user.getUser()))){
            return false;
        }
        mapsUsuarios.put(user.getUser(), user);
        return true;
    }

    @Override
    public boolean update(User user) {
        User algs = mapsUsuarios.get(user.getUser());

        if (algs != null){
            mapsUsuarios.put(user.getUser(), user);
            return true;
        }
        return false;
    }

    @Override
    public User findByLogin(String login) {
        for(String i : mapsUsuarios.keySet()){
            if (login.equals(i)){
                return mapsUsuarios.get(i);
            }
        }
        return null;
    }
}