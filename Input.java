package memo;

import java.util.*;

public class Input {
    Map<Integer, Memo> memoList = new LinkedHashMap<>();
    public void inputMemo(int textNum, String name, String password, String text) {
        Memo memo = new Memo(name, password, text);
        memoList.put(textNum, memo);
    }

    public void printMemo() {
        Set<Integer> keySet = memoList.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " : " + memoList.get(key));
        }
    }
}
