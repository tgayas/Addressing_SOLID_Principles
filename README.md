# Addressing_SOLID_Principles
CPRO 2221  Assignment 2

Exp. 

1. Single Responsibility Principle (SRP)
Violated Explanation
The ReportGenerator class violates the Single Responsibility Principle because it has multiple responsibilities:

Fetching data from the database.
Formatting the data into a specific structure (JSON).
Generating the report (PDF).
Each of these tasks could potentially change for different reasons:

Data retrieval might change based on database or API updates.
Formatting could change to support different structures like XML or CSV.
The reporting logic might be updated to handle new output types.
By bundling all these responsibilities in one class, we make the class harder to maintain and prone to introducing bugs when changes are made.

Solved Explanation
The responsibilities of the ReportGenerator class are split into three separate classes:

DataFetcher: Handles data retrieval.
DataFormatter: Formats the retrieved data.
ReportGenerator: Focuses solely on generating the report.
This refactoring adheres to the Single Responsibility Principle. Each class now has one clear responsibility and one reason to change. This design improves maintainability, scalability, and clarity.

2. Open-Closed Principle (OCP)
Violated Explanation
The DiscountCalculator class violates the Open-Closed Principle because it requires modification whenever a new customer type is introduced. This is evident from the conditional logic (if-else) that determines the discount based on the customer type.

Each time a new customer type (e.g., "Student", "Senior Citizen") needs a specific discount, developers must modify the existing calculateDiscount method. This approach is error-prone, reduces readability, and risks breaking existing functionality.

Solved Explanation
The DiscountCalculator class is refactored to adhere to the Open-Closed Principle by introducing a strategy pattern. A DiscountStrategy interface is created, and different customer types implement this interface:

RegularCustomerDiscount
PremiumCustomerDiscount
VIPCustomerDiscount
Now, the DiscountCalculator class uses the DiscountStrategy interface, allowing new customer types to be added by simply implementing a new strategy. This avoids modifying the existing DiscountCalculator class, ensuring it remains closed for modification but open for extension.

3. Interface Segregation Principle (ISP)
Violated Explanation
The Printer interface violates the Interface Segregation Principle because it forces classes to implement methods that they do not need or cannot support. For example:

BasicPrinter only supports printing, but it is forced to implement scanDocument and faxDocument methods, which it doesn't support.
To deal with unsupported methods, BasicPrinter throws exceptions, leading to poor design and increased complexity for the client.
This design results in a bloated interface that does not adhere to the specific needs of implementing classes.

Solved Explanation
The Printer interface is refactored into smaller, more focused interfaces:

PrintFunction: For printing functionality.
ScanFunction: For scanning functionality.
FaxFunction: For faxing functionality.
Now, classes implement only the interfaces they need:

BasicPrinter implements PrintFunction because it only supports printing.
MultiFunctionPrinter implements PrintFunction, ScanFunction, and FaxFunction because it supports all functionalities.
This design adheres to the Interface Segregation Principle by creating interfaces tailored to the specific needs of clients, improving clarity, and avoiding unnecessary implementation of unused methods.

