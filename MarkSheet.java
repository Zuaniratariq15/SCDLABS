package marksheet;

public class MarkSheet {
	private String studentName;
	private double totalMarks;
	private double obtainedMarks;
// Constructor
	public MarkSheet(String studentName, double totalMarks, double obtained Marks) {
		this.studentName = studentName;
		this.totalMarks totalMarks;
		this.obtainedMarks obtainedMarks;
}
	// Method to calculate percentage
	private double calculatePercentage() {
	return (obtainedMarks / totalMarks) * 100;
	}
	// Method to determine grade based on percentage
	private String determineGrade() {
	double percentage calculatePercentage();
	if (percentage >= 90) return "A+";
	if (percentage >= 80) return "A";
	if (percentage >= 70) return "B";
	if (percentage >= 60) return "C";
	if (percentage >= 50) return "D";
	return "F";
	}
	// Method to calculate GPA based on grade
	private double calculateGPA() {
	switch (determineGrade()) {
	case "A+":
	case "A":
		return 3.7;
		case "B":
		return 3.0;
		case "C":
		return 2.0;
		case "D":
		return 1.0;
		case "F":
		return 0.0;
		default:
		return 0.0;
		}
		}

	// Method to display the mark sheet
	public void displayMarkSheet() {
	System.out.printf("\n--- Mark Sheet-%n");
	System.out.printf("Student Name: %s%n", studentName);
	System.out.printf("Total Marks: %.2f%n", totalMarks);
	System.out.printf("Obtained Marks: %.2f%n", obtainedMarks);
	System.out.printf("Percentage: %.2f%%%n", calculatePercentage());
	System.out.printf("Grade: %s%n", determineGrade());
	System.out.printf("GPA: %.2f%n", calculateGPA());
	}
	}
}
