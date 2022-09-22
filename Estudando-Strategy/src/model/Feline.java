package model;

public class Feline {
	private RunStrategy strategyRun;
	private JumpStrategy strategyJump;
	
	public String toString()
	{
		String details = "Ação de corrida:"+ this.getStrategyRun().run()+"\n"+
				"Ação de pulo:"+this.getStrategyJump().jump();
		return details;
	}
	
	public String roar()
	{
	  return "a";	
	}

	public RunStrategy getStrategyRun() {
		return strategyRun;
	}

	public void setStrategyRun(RunStrategy strategyRun) {
		this.strategyRun = strategyRun;
	}

	public JumpStrategy getStrategyJump() {
		return strategyJump;
	}

	public void setStrategyJump(JumpStrategy strategyJump) {
		this.strategyJump = strategyJump;
	}
	
	
}
