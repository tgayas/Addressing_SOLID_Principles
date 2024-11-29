// The Printer interface is divided into smaller interfaces.
// Now, BasicPrinter only implements PrintFunction, adhering to ISP.


interface PrintFunction {
    void printDocument(String content);
}

interface ScanFunction {
    void scanDocument(String content);
}

interface FaxFunction {
    void faxDocument(String content);
}

class BasicPrinter implements PrintFunction {
    @Override
    public void printDocument(String content) {
        System.out.println("Printing: " + content);
    }
}

class MultiFunctionPrinter implements PrintFunction, ScanFunction, FaxFunction {
    @Override
    public void printDocument(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scanDocument(String content) {
        System.out.println("Scanning: " + content);
    }

    @Override
    public void faxDocument(String content) {
        System.out.println("Faxing: " + content);
    }
}
