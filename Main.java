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
        int textNum = 1;
        boolean start = true;

        while (start) {
            Input input = new Input();
            Scanner sc = new Scanner(System.in);

            System.out.println("[ 메모장 ]");
            System.out.println("1. 글 작성");
            System.out.println("2. 목록 보기");
            System.out.println("3. 글 수정");
            System.out.println("4. 글 삭제");
            System.out.println("5. 종료\n");

            System.out.print("입력 : ");

            int num = sc.nextInt();

            switch (num) {
                case 1 :

                    String name = sc.nextLine().trim();
                    System.out.print("\n이름 : ");

                    String password = sc.nextLine().trim();
                    System.out.print("비밀번호 : ");

                    String text = sc.nextLine().trim();
                    System.out.print("내용 : ");

                    input.inputMemo(textNum, name, password, text);
                    System.out.println();
                    input.printMemo();
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5:
                    System.out.println("종료합니다.\n");
                    break;
            }

//            start = false;
        }
    }
}