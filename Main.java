package memo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    String name = sc.nextLine();
                    System.out.print("\n이름 : ");

                    String password = sc.nextLine();
                    System.out.print("비밀번호 : ");

                    String text = sc.nextLine();
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