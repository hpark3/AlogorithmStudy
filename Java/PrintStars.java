import java.util.*;

public class PrintStars{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); //a�� ������ ��
        int b = sc.nextInt(); //b�� ������ ��
        
        for (int i = 0; i < b; i++) { //b�ٸ���
        	for (int j = 0; j < a; j++) { //a���� �� ���
				System.out.printf("*");
			}
			System.out.println(); //�� �� ��� ��ĥ ������ ����
		}
    }
}