import java.util.*;

public class PrintStars{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //a는 가로줄 수
        int b = sc.nextInt(); //b는 세로줄 수
        
        for (int i = 0; i < b; i++) { //b줄마다
        	for (int j = 0; j < a; j++) { //a개의 별 출력
				System.out.printf("*");
			}
			System.out.println(); //한 줄 출력 마칠 때마다 개행
		}
    }
}