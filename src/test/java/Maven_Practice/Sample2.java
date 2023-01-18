package Maven_Practice;

import org.testng.annotations.Test;

public class Sample2 {
	@Test(groups = "smoke")
	public void abc() {
		System.out.println("---TestScript04----");
	}

	@Test(groups = "regression")
	public void def() {
		System.out.println("---TestScript05----");
	}

}
