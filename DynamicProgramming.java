
public class DynamicProgramming {
	public static void main(String[] args) {
		
		// ������ȹ�� DP
			// ū ������ ���� ������ ���� Ǫ�� �˰���
		
			// �Ӽ�
				// 1. �κ� ������ ��ģ��
				// 2. ���� �κ� ����
		
			// ���
				// 1. Top-Down
					// ū ������ ���� ������ ���� �� ���� ���� Ǯ��
					// -> ���ȣ�� �ϴ� ���
		
		// ex �Ǻ���ġ ����
		
		memo = new int [100];
		System.out.println(fibonacci1(6));
		
				// 2. Bottom-Up
					// ���� �������� ���� ���� ���� Ǯ�鼭 ū ���� �� ����
					
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
