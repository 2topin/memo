package memo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        public static void deleteMemo() {
            System.out.println("삭제할 글 번호를 입력하세요 : ");
            int deleteIndex = scanner.nextInt();

            if (deleteIndex >=0 && deleteIndex < memos.size()) {
                System.out.println("비밀번호를 입력하세요.");
                String password = scanner.nextLine();

                if (deleteIndex < passwords.size() && password.equals(passwords.get(deleteIndex))) {
                    memos.remove(deleteIndex);
                    passwords.remove(deleteIndex);
                    System.out.println("글이 삭제되었습니다.");
                } else if (!password.equals(passwords.get(deleteIndex))) {
                    System.out.println("비밀번호가 일치하지 않습니다. 글을 삭제할 수 없습니다.");
                } else {
                    System.out.println("해당번호의 글이 존재하지 않습니다.");
                }
            }
        }
    }
}
