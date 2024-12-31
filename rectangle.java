package rectangle;

public class rectangle {
	private double length;
	private double width;
	// Default constructor
	public Rectangle() {
	this.length = 1.0;
	this.width - 1.0;
	>
	// Parameterized constructor
	public Rectangle(double length, double width) {
	setLength(length);
	setWidth(width);
	>
	// Method to calculate the perimeter
	public double calculatePerimeter() {
	return 2 - (length width);
	}
	//Method to calculate the area
	public double calculateArea() {
	return length * width;
	}
	//Setter for length with validation
	public void setLength (double length) {
	if (isValidDimension(length)) {
	this.length = length;
	} else {
	throw new IllegalArgumentException("Length must be greater than 0.0 and less than 20.0");
	}
	}
	//Setter for width with validation
	public void setWidth(double width) {
	if (isValidDimension(width)) {
	this.width = width;
	} else {
	throw new IllegalArgumentException("Width must be greater than 0.0 and less than 20.0");
	}
	}
	//Getter for length
	public double getLength() {
	return length;
	//Getter for length
	public double getLength() {
	return length;
	}
	//Getter for width
	public double getWidth() {
	return width;
	}
	//Helper method to validate dimensions
	private boolean isValidDimension (double value) {
	return value > 0.0 && value < 20.0;
	}
	}
	public class task2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	//Create a default rectangle
	Rectangle rectangle = new Rectangle();
	System.out.printf("Default Rectangle: Length = %.2f, Width = %.2f%n",
	rectangle.getLength(), rectangle.getWidth());
	System.out.printf("Perimeter: %.2f, Area: %.2f%n",
	rectangle.calculatePerimeter(), rectangle.calculateArea());
	//User input for custom rectangle
	System.out.println("\nEnter dimensions for a custom rectangle:");
	double length = getValidInput (scanner, "Length: ");
	double width getValidInput (scanner, "Width: ");
	//Set the custom dimensions
	rectangle.setLength (length);
	rectangle.setWidth(width);
	//Display the custom rectangle properties
	System.out.printf("Custom Rectangle: Length = %.2f, Width = %.2f%n",
	rectangle.getLength(), rectangle.getWidth());
	System.out.printf("Perimeter: %.2f, Area: %.2f%n",
	rectangle.calculatePerimeter(), rectangle.calculateArea());
	scanner.close();
	//Method to get valid input from user
	private static double getValid Input (Scanner scanner, String prompt) {
	double value = 0.0;
	boolean valid = false;
	while (!valid) {
	System.out.print(prompt);
	if (scanner.hasNextDouble()) {
	value scanner.nextDouble();
	if (value > 0.0 && value < 20.0) {
	valid true;
	} else {
	System.out.println("Value must be greater than 0.0 and less than 20.0.");
	}
	} else {
	System.out.println("Invalid input. Please enter a valid number.");
	scanner.next(); // Clear invalid input
	}
	}
	return value;
	}
	}

}
