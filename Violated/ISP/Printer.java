// The BasicPrinter class is forced to implement methods it does not support.

interface Printer {
    void printDocument(String content);
    void scanDocument(String content);
    void faxDocument(String content);
}

class BasicPrinter implements Printer {
    @Override
    public void printDocument(String content) {
        System.out.println("Printing: " + content);
    }

    @Override
    public void scanDocument(String content) {
        // BasicPrinter does not support scanning
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void faxDocument(String content) {
        // BasicPrinter does not support faxing
        throw new UnsupportedOperationException("Fax not supported");
    }
}
