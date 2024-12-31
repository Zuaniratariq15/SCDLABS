package rollnmu1;

public class rollnum1 {
		class RollNoTable Thread extends Thread {
			@Override
			public void run()
			class DobTableThread extends Thread (
			@Override
			public void run() {
			String dob ="5th June":
			System.out.println("\nMultiplication Table for Date of Birth: + dob):
			for (int i=1;110; 1++) {
			System.out.println(dob +
			1)); // Multiplying the day "5" of the birth date
			}
			try {
			Thread.sleep(100); // Simulate a small delay
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			public class Main {
			public static void main(String[] args) {
			// Create threads
			Thread rollNoThread = new RollNoTableThread();
			Thread dobThread new DobTableThread();
			rollnumThread.start();
			dobThread.start();
			//Wait for both threads to finish
			try {
			rollNoThread.join();
			dobThread.join();
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
			System.out.println("\nBoth tables have been printed concurrently!");
			}
	}
		

}
