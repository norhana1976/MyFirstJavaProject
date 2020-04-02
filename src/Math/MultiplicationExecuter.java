package Math;

public class MultiplicationExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiplicationTable table = new MultiplicationTable();
		for (int x=1; x<=12; x++) {
		System.out.println("------TABLE ["+ x +"]-------");
		table.print(x, 11, 15);
		}
		//table.print(5);
	}
}
