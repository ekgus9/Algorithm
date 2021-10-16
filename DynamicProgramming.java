
public class DynamicProgramming {
	public static void main(String[] args) {
		
		// 동적계획법 DP
			// 큰 문제를 작은 문제로 나눠 푸는 알고리즘
		
			// 속성
				// 1. 부분 문제가 겹친다
				// 2. 최적 부분 구조
		
			// 방식
				// 1. Top-Down
					// 큰 문제를 작은 문제로 나눈 후 작은 문제 풀기
					// -> 재귀호출 하는 방식
		
		// ex 피보나치 수열
		
		memo = new int [100];
		System.out.println(fibonacci1(6));
		
				// 2. Bottom-Up
					// 작은 문제부터 쓰고 작은 문제 풀면서 큰 문제 답 구함
					
		System.out.println(fibonacci2(10));
		
	}
	public static int memo[];
	public static int fibonacci1(int n) {
		if (n<=1) return n;
		else if (n == 2) return 1;
		else {
			if (memo[n]>0) return memo[n];
			memo[n] = fibonacci1(n-1) + fibonacci1(n-2);
			return memo[n];
		}
	}
	public static int fibonacci2(int n) {
		memo[0] = 0;
		memo[1] = 1;
		for(int i=2;i<=n;i++) {
			memo[i] = memo[i-1]+memo[i-2];
		}
		return memo[n];
	}
}
