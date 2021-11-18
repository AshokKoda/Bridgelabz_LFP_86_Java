package bridgelabzAssignment;

public class EmployeeWageUsingSwitch {
	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int RatePerHour = 20;

	public static void main(String[] args) {
		int empHrs = 0;
		int empWage = 0;
		
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		switch (empCheck)
		{
		case PartTime:
			empHrs = 4;
			break;
		case FullTime:
			empHrs = 8;
			break;
		default:
			empHrs = 0;
		}
		empWage = empHrs * RatePerHour;
		System.out.println("Employee Wage: " + empWage);
	}

}
