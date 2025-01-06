class Printer {
private int availablePages 10,
// Method to add pages to the tray
public synchronized void addPages (int pages) (
availablePages + pages;
System.out.println("Added" pages. pages to the tray. Total pages: availablePages);
natify();
// Notify the waiting print thread
// Method to print pages
public synchronized void printPages(int pages) (
System.out.println("Print request received for + pages pages.");
// Wait until enough pages are available
while (availablePages pages) (
System.out.println("Insufficient pages. Waiting for more pages...");
try (
wait();
} catch (InterruptedException e) {
	wait();
	} catch (InterruptedException e) (
	e.printStackTrace();
	// Proceed with printing
	availablePages pages;
	System.out.println("Printed + pages + pages. Remaining pages: + availablePages);
	}
	}
	private Printer printer;
	private int pagesToPrint;
	public PrintThread (Printer printer, int pagesToPrint) {
	this.printer = printer;
	this.pagesToPrint pagesToPrint;
	}
	@Override
	public void run() {
	printer.printPages (pagesToPrint);
	}
	}
	public class Main {
	public static void main(String[] args) (
	Printer printer new Printer();
	// Create threads
	PrintThread print Thread new Print Thread(printer, 15); // Request to print 15 pages
	AddPages Thread addPages Thread new AddPages Thread(printer); // Adds 10 pages to tray
	// Start threads
	printThread.start();
	addPages Thread.start();
	}
}