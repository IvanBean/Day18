package ivankuo.com.myapplication2;

public class RemoveItemEvent {

    private int Position;
    private String Text;

    public RemoveItemEvent(int position, String text) {
        this.Position = position;
        this.Text = text;
    }

    public int getPosition() {
        return Position;
    }

    public String getText() {
        return Text;
    }
}
