package memo;

import java.util.*;

public class Input {
    Map<Integer, Memo> memoList = new LinkedHashMap<>();

    public void inputMemo(int textNum, String name, String password, String text) {
        Memo memo = new Memo(name, password, text);
        memoList.put(textNum, memo);
    }

    public void printMemo() { // 번호 이름  비밀번호 등등
        Set<Integer> keySet = memoList.keySet();
        for (Integer key : keySet) { // 1. 이름, 비밀 2. 이름 비밀
            System.out.println(key + " : " + memoList.get(key));
        }
    }
}