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

    public void deleteText(int num) {
        Scanner sc = new Scanner(System.in);

        System.out.println("해당 글을 삭제하시겠습니까?");
        System.out.println("1. 확인    | 2. 취소");
        int confirm = sc.nextInt();

        if (confirm == 1) {
            memoList.remove(num-1);
            System.out.println("삭제가 완료되었습니다.");
        } else if (confirm == 2) {
            System.out.println("메인으로 돌아갑니다.");
            return;
        }
    }
}