package ivankuo.com.myapplication2;

public class MessageEvent {

    private String Message;

    public MessageEvent(String message) {
        this.Message = message;
    }

    public String getMessage() {
        return Message;
    }
}