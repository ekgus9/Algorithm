import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backtracking {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// ��Ʈ��ŷ Backtracking
			// �������� ������ ���� �� �θ� ���� �ǵ��ư� -> �ð� ����
			// ���� �ֱ� �� ������ �˻�
		
		// N-queens
			// n���� ���� n*n ü���� �� ���� �������� ���ϴ� ��ġ�� ��ġ
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine()); // n �Է� ����
		result = 0;
		
		for (int i=1;i<=N;i++) { // 1���� 1-n�� �� �ֺ���
			col = new int[N+1];
			col[1] = i;
			
			back(2); // 2�� backtracking
		}
		System.out.println(result);

	}
	public static int N;
	public static int col[];
	public static int result;
	public static void back(int n) {
		if(n>N) { // ���� �� �Ѿ�� ����� �� �ϳ� �� ����
			result++;
			return;
		}
		
		for(int i=1;i<=N;i++) { // �� �ϳ��� �Ǵ��� Ȯ��
			col[n] = i;
			
			if(ispossible(n)) { 
				back(n+1);
			}
		}
	}
	public static boolean ispossible(int n) { // ������ �˻�
		for(int i=1;i<=n-1;i++) { // �� ���� ���� �ش� ���� ���� �����̳� �밢���� ���迡 ���� ������ �ȵ� 
			if(col[i] == col[n] || Math.abs(col[i]-col[n])==Math.abs(i-n)){
				return false;
			}
		}
		return true;
	}

}
