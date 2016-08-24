package by.vsu.mf.aoad.utils;

import static java.lang.Math.abs;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Fraction {
	private int numerator;
	private int denominator;

	private Fraction(int numerator, int denominator, boolean needReduce) {
		if(denominator != 0) {
			boolean isNegative = numerator != 0 && (numerator > 0 ^ denominator > 0);
			this.numerator = abs(numerator);
			this.denominator = abs(denominator);
			if(needReduce) {
				int max = max(this.numerator, this.denominator);
				int min = min(this.numerator, this.denominator);
				int tmp;
				while(min > 0) {
					tmp = max % min;
					max = min;
					min = tmp;
				}
				this.numerator /= max;
				this.denominator /= max;
			}
			if(isNegative) {
				this.numerator = -this.numerator;
			}
		} else {
			throw new ArithmeticException();
		}
	}

	public Fraction() {
		this(0, 1, false);
	}

	public Fraction(int number) {
		this(number, 1, false);
	}

	public Fraction(int numerator, int denominator) {
		this(numerator, denominator, true);
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}
}