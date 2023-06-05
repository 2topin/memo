package memo;

import java.util.ArrayList;
import java.util.Collections;

public class Input {
    ArrayList<Input> memoList = new ArrayList<>();
    String name;
    String password;
    String text;

    Input( String name, String password, String text) {
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

    public ArrayList<Input> getMemoList() {
        return memoList;
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

    public void setMemoList(ArrayList<Input> memoList) {
        this.memoList = memoList;
    }

    public void addList(int textNum) {
        Input inputList = new Input(getName(), getPassword(), getText());
        memoList.add(textNum, inputList);
    }

    public void printList() {
        Collections.reverse(getMemoList());
        for (Input i : getMemoList()) {
            System.out.println(i.getName() + i.getPassword() + i.getText());
        }
    }
}
