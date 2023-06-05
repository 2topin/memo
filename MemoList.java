//package memo;
//
//import java.util.Scanner;
//
//public class MemoList {
//
//    public void update() {
//        Scanner sc = new Scanner(System.in);
//        String update = sc.nextLine();
//
//        switch (update) {
//            case "3" : // 수정기능을 선택했을 때
//                String num = sc.nextLine(); // 수정할 글 번호를 입력 받음
//                if(num.equals("")) { // 리스트 글번호를 받아와 num 입력 값과 동일한 넘버가 있으면 수정
//                    // 비밀번호 입력 후 글을 수정
//                    String password = sc.nextLine(); // 비밀번호 입력
//
//                    if(password) {
//                        // 만약에 입력받은 비밀번호와 password가 같다면 수정
//                    } else {
//                        System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
//                    }
//                } else {
//                    System.out.println("글이 존재하지 않습니다. of 존재하지 않는 글입니다.");
//                }
//        }
//    }
//}
