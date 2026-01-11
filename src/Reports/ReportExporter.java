package Reports;

import java.io.File;

public interface ReportExporter {

	/**
	 * 
	 * @param report
	 */
	File export(Report report);

}