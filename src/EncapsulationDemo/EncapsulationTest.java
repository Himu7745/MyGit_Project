package EncapsulationDemo;

public class EncapsulationTest {

	public static void main(String[] args) {
		StudentsClass sc = new StudentsClass();
		sc.setName("himu");
		System.out.println(sc.getName());
		sc.setSSN(67899);
		System.out.println(sc.getSSN());
		
	}

}
