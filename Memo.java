package memo;


public class Memo {
    String name;
    String password;
    String text;

    public Memo( String name, String password, String text) {
        this.name = name;
        this.password = password;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getText() {
        return text;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setText(String text) {
        this.text = text;
    }
}