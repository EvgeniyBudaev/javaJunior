package interview.task;

public class TextBuffer {
    private String text;

    public TextBuffer() {
    }

    public TextBuffer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
