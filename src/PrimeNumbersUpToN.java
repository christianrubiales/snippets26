

public class PrimeNumbersUpToN {

	static void printPrimes(int n) {
		boolean[] sieve = new boolean[n+1];
		int sqrt = (int) Math.sqrt(n);
		
		for (int i = 2; i <= n; i++) {
			sieve[i] = true;
		}
		
		for (int i = 2; i < sqrt + 2; i++) {
			for (int j = i + i; j < n + 1; j += i) {
				sieve[j] = false;
			}
		}
		
		for (int i = 2; i <= n; i++) {
			if (sieve[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		printPrimes(100);
	}

}
