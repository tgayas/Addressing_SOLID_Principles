The ReportGenerator class has multiple responsibilities: fetching data, formatting it,
and generating a report.
If any of these functionalities change, the class needs to be modified, violating SRP.





public class ReportGenerator {
    public void fetchData() {
        // Fetch data from a database
        System.out.println("Fetching data from the database...");
    }

    public String formatData(String data) {
        // Format data as JSON
        return "{ \"data\": \"" + data + "\" }";
    }

    public void generateReport(String formattedData) {
        // Generate a PDF report
        System.out.println("Generating PDF report with data: " + formattedData);
    }

    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.fetchData();
        String formattedData = reportGenerator.formatData("Sample Data");
        reportGenerator.generateReport(formattedData);
    }
}
