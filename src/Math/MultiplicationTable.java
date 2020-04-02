package Math;

public class MultiplicationTable {
	void print(int table, int from, int to) {
	for(int i=from; i<=to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
	}
	}
	
	void print(int x) {
		for(int i=1; i<=10; i++) {
				System.out.printf("%d * %d = %d", x, i, x * i).println();
		}
		}
}