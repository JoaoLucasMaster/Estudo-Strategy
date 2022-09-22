package view;
import model.*;
public class Main {

	public static void main(String[] args) {
		
		JumpStrategy jump1= new HighJump();
		JumpStrategy jump2= new LowJump();
		
		RunStrategy run1= new RunLongDistance();
		RunStrategy run2= new RunShortDistance();
		RunStrategy run3= new RunMedianDistance();
		
		Feline test1 = new Lion();
		Feline test2 = new Tiger();
		Feline test3 = new Leopard();
		
		test1.setStrategyJump(jump1);
		test2.setStrategyJump(jump2);
		test3.setStrategyJump(jump1);
		
		test1.setStrategyRun(run1);
		test2.setStrategyRun(run2);
		test3.setStrategyRun(run3);
		
		System.out.printf(test1.toString());
		System.out.println("");
		System.out.println("");
		System.out.printf(test2.toString());
		System.out.println("");
		System.out.println("");
		System.out.printf(test3.toString());
		
		
	}

}
