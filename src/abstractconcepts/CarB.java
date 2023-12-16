package abstractconcepts;

public  class CarB extends CarA  {

	@Override
	void deposit() {
		System.out.println("deposit ");
		
	}

	@Override
	void withDraw() {
		System.out.println("withdraw");
		
	}

	@Override
	void debit() {
		System.out.println("debit");
		
	}

}
