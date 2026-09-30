package ads.seg;

public class UserService {


    private void register() {

        if (!listaUsuarios.containsValue()) {


            //  throw new UserAlreadyExistsException;
        }
        try {
            throw new UserAlreadyExistsException("msg");
        } catch (UserAlreadyExistsException e) {
            throw new RuntimeException(e);
        }

    }

    private void updatePassword() {
        // throw new UserNotFoundException
        // throw new InvalidPasswordException

    }
    private void authenticate() {

    }




}
