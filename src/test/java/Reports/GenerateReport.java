package Reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class GenerateReport {

	public static void main(String[] args) {

		// Location where the report will be generated
		File reportOutputDirectory = new File("target/cucumber-report-html");

		// Path to the Cucumber JSON report
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("target/reports/cucumber.json");

		// Report configuration
		Configuration configuration = new Configuration(reportOutputDirectory, "Selenium Project");
		configuration.setBuildNumber("1");
		configuration.addClassifications("Platform", "Windows");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Tester", "Ananya");

		// Generate report
		ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
		reportBuilder.generateReports();

		System.out.println("Report generated successfully.");
	}
}