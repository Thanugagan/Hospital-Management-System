package Maven_Practice;

import org.testng.annotations.Test;

public class Sample1 {
	@Test(groups = "smoke")
	public void Sam() {
		System.out.println("---TestScript01----");
	}

	@Test(groups = "regression")
	public void Sam1() {
		System.out.println("---TestScript02----");
	}

}
