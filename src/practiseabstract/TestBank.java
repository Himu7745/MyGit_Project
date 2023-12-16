package practiseabstract;

public class TestBank {
	public static void main(String[] args) {
		TdBank td=new TdBank();
		td.deposit();
		td.cash();
		td.withDraw();
		System.out.println(ChaseBank.pant);
		
		System.out.println(td.backpack);
		System.out.println(td.shirt);
		
		
	}

}
