package br.com.objective.checker;

public abstract class MultiploAbstractChecker {

	protected final int divisor;

	protected MultiploAbstractChecker(int divisor) {
		this.divisor = divisor;
	}

	public boolean isMultiplo(int numero) {
		return numero % this.divisor == 0;
	}

	public abstract String output();
}
