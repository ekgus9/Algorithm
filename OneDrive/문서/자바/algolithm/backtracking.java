import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backtracking {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// 백트랙킹 Backtracking
			// 유망하지 않으면 배제 후 부모 노드로 되돌아감 -> 시간 단축
			// 스택 넣기 전 유망성 검사
		
		// N-queens
			// n개의 퀸을 n*n 체스판 위 서로 공격하지 못하는 위치에 배치
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine()); // n 입력 받음
		result = 0;
		
		for (int i=1;i<=N;i++) { // 1행의 1-n열 퀸 둬보기
			col = new int[N+1];
			col[1] = i;
			
			back(2); // 2행 backtracking
		}
		System.out.println(result);

	}
	public static int N;
	public static int col[];
	public static int result;
	public static void back(int n) {
		if(n>N) { // 행이 판 넘어가면 경우의 수 하나 더 적립
			result++;
			return;
		}
		
		for(int i=1;i<=N;i++) { // 열 하나씩 되는지 확인
			col[n] = i;
			
			if(ispossible(n)) { 
				back(n+1);
			}
		}
	}
	public static boolean ispossible(int n) { // 유망성 검사
		for(int i=1;i<=n-1;i++) { // 각 행의 퀸과 해당 행의 퀸이 직선이나 대각선에 관계에 놓여 있으면 안됨 
			if(col[i] == col[n] || Math.abs(col[i]-col[n])==Math.abs(i-n)){
				return false;
			}
		}
		return true;
	}

}
