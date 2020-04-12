package patterns;

import org.testng.annotations.Test;

public class Pattern1 {

	@Test(enabled = false, description = "related to pattern 1")
	public void pattern1() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	@Test(enabled = false, description = "related to pattern 2")
	public void pattern2() {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	@Test(enabled = false, description = "related to pattern 3")
	public void pattern3() {
		for (int i = 0; i < 5; i++) 
		{
			for (int j = i; j < 5; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	@Test(enabled = false, description = "related to pattern 4")
	public void pattern4() {
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < 5; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	@Test(enabled = false, description = "related to pattern 1 n 2")
	public void pattern1_2() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");

		}
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	@Test(enabled = true, description = "related to pattern 3 n 4")
	public void pattern3_4() {
		for (int i = 0; i < 5; i++) 
		{
			for (int j = i; j < 5; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("");
			}
			for (int k = i; k < 4; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
