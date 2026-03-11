package br.com.objective.printer;

import br.com.objective.checker.MultiploAbstractChecker;
import br.com.objective.checker.MultiploCheckerFive;
import java.util.Objects;

public class PrintMultiploFive extends ChainPrintable {

	private final MultiploAbstractChecker checkerFive;

	public PrintMultiploFive(Printable nextPrintable) {
		super(nextPrintable);
		this.checkerFive = new MultiploCheckerFive();
	}

	@Override
	public String print(Integer numero) {
		String result = "";

		if (checkerFive.isMultiplo(numero)) {
			result = checkerFive.output();
		}

		if (Objects.nonNull(nextPrintable)) {
			result += nextPrintable.print(numero);
		}

		return result;
	}
}
