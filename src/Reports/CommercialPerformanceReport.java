package Reports;

import java.util.ArrayList;
import java.util.List;
import CoreUsers.*;

public class CommercialPerformanceReport extends Report {

	private List<SalesAdvisor> analyzedAdvisors;
	private List<String> marketInsights;

	// SD-REP-001: Constructor para reporte gerencial
	public CommercialPerformanceReport(Executive manager) {
		super(manager, "Reporte de Desempeño Comercial");
		this.analyzedAdvisors = new ArrayList<>();
		this.marketInsights = new ArrayList<>();
	}

	public void addAnalyzedAdvisor(SalesAdvisor advisor) {
		this.analyzedAdvisors.add(advisor);
	}

	public void addMarketInsight(String insight) {
		this.marketInsights.add(insight);
	}

	public List<SalesAdvisor> getAnalyzedAdvisors() {
		return this.analyzedAdvisors;
	}

}