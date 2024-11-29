//Each class now has a single responsibility:

//DataFetcher: Responsible for data retrieval.
//DataFormatter: Handles formatting.
//ReportGenerator: Generates the report.

class DataFetcher {
    public String fetchData() {
        // Fetch data from a database
        System.out.println("Fetching data from the database...");
        return "Sample Data";
    }
}

class DataFormatter {
    public String formatData(String data) {
        // Format data as JSON
        return "{ \"data\": \"" + data + "\" }";
    }
}

class ReportGenerator {
    public void generateReport(String formattedData) {
        // Generate a PDF report
        System.out.println("Generating PDF report with data: " + formattedData);
    }
}

public class Main {
    public static void main(String[] args) {
        DataFetcher fetcher = new DataFetcher();
        DataFormatter formatter = new DataFormatter();
        ReportGenerator generator = new ReportGenerator();

        String rawData = fetcher.fetchData();
        String formattedData = formatter.formatData(rawData);
        generator.generateReport(formattedData);
    }
}
