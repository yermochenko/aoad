package by.vsu.mf.aoad.test;

import by.vsu.mf.aoad.utils.Fraction;

public class TestFractionReduce {
	public static void main(String[] args) {
		for(int i = -10; i <= 10; i++) {
			for(int j = -10; j <= 10; j++) {
				try {
					Fraction f = new Fraction(i, j);
					System.out.printf("%3d / %3d is equal to %d/%d\n", i, j, f.getNumerator(), f.getDenominator());
				} catch(ArithmeticException e) {
					System.out.printf("%3d / %3d (%s)\n", i, j, "div by zero");
				}
			}
		}
	}
}