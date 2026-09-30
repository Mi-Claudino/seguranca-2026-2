package ads.seg;

public class UserAlreadyExistsException extends Throwable {
    public UserAlreadyExistsException(String mnsg){
        super(mnsg);
    }
}
