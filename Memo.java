package memo;


public class Memo {
    String name;
    String password;
    String text;
    String now;

    public Memo(String name, String password, String text, String now) {
        this.name = name;
        this.password = password;
        this.text = text;
        this.now = now;
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

    public String toString() {
        return "Memo [이름 : " + name + " | 비밀번호 : " + password + " | 내용 : " + text + " | 작성일 : " + now + "]";
    }
}
