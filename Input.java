package memo;

import java.util.*;

public class Input {
    Map<Integer, Memo> memoList = new LinkedHashMap<>();

    public void inputMemo(int textNum, String name, String password, String text, String now) {
        Memo memo = new Memo(name, password, text, now);
        memoList.put(textNum, memo);
    }

    public void printMemo() {
        Set<Integer> keySet = memoList.keySet();
        for (Integer key : keySet) {
            System.out.println((key+1) + " - " + memoList.get(key));
        }
    }
}