package _0514_.basic;

public class NumberPrinter01 extends Thread {

    private NumberPrinter printer;

    public NumberPrinter getPrinter() {
        return this.printer;
    }

    public void setPrinter(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run(){
        this.printer.numPrint1(1);
    }
}
