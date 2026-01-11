package Reports;

import CoreUsers.*;

public class OperationalReport extends Report {

	private SalesObjective benchmarkObjective;

	public OperationalReport(ImmediateSupervisor supervisor) {
		super(supervisor, "Reporte Operacional");
	}

	public void setBenchmarkObjective(SalesObjective objective) {
		this.benchmarkObjective = objective;
	}

	public SalesObjective getBenchmarkObjective() {
		return this.benchmarkObjective;
	}

}