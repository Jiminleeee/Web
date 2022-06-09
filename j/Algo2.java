package j;

import java.util.Scanner;

public class Algo2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();  //공사 현장의 x좌표 
    int y = scanner.nextInt();  //공사 현장의 y좌표
    int R = scanner.nextInt();  //공사장 소음의 크기
    int count = scanner.nextInt();  //나무 그늘의 수 
    int placeX; //그늘의 x좌표
    int placeY; //그늘의 y좌표
    //System.out.println(); //가독성 위해 한줄 띄우기(?)
    for (int i = 1; i <= count; i++) { //나무 그늘의 수만큼
      placeX = scanner.nextInt();   //그늘의 x좌표
      placeY = scanner.nextInt();   //그늘의 y좌표

      //그늘의 위치가 공사현장에서 R미터 이상 떨어져 있을 때
      if (Math.pow((placeX - x), 2) + Math.pow((placeY - y), 2) >= Math.pow(R, 2)) {
        System.out.println("silent");   //silent 출력
      } else {  //R미터 미만으로 떨어져 있을 때
        System.out.println("noisy");  //noisy 출력
      }

    }

  }
  //solution 활용해서 풀어보기ㅠㅠ
  public static String solution() {
    
  }
}
