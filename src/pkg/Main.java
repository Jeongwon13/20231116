package pkg;

class Solution {
	//동적 계획법
	static int[] data = new int[100001];

	private int fibonacci(int n) {
	    if(2>n) return n;
	    if(data[n] != 0) return data[n] % 1234567;

	    return data[n] = (fibonacci(n-1) + fibonacci(n-2)) % 1234567;
	}

	public int solution(int n) {
	    int answer = 0;
	    answer = fibonacci(n);
	    return answer;
	}
	}