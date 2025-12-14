package Adabter_Pattern;

public class PrinterAdapter implements Printer {
    
    private LegacyPrinter legacyPrinter = new LegacyPrinter();

    
    @Override
    public void print(){
        this.legacyPrinter.printDocument();

    }
}
