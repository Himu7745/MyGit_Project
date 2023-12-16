package practiseabstract;

public class TdBank extends  ChaseBank{

	@Override
	void deposit() {
		System.out.println("deposit");
		
	}

	@Override
	void withDraw() {
		System.out.println("withdraw");
		
	}

	@Override
	void cash() {
		System.out.println("cash");
		
	}

}
