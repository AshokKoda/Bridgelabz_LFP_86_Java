package bridgelabzAssignment;

public class EmpMonthlyWorking {
	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int RatePerHour = 20;
	public static final int NumOfWorkingDays = 2;

	public static void main(String[] args) {
		int empHrs = 0, empWage = 0, totalWage = 0;
		
		for(int day = 0; day < NumOfWorkingDays; day++)
		{
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
			totalWage += empWage;
			System.out.println("Employee Wage: " + empWage);
		}
		System.out.println("Total Employee Wage: " + totalWage);

	}

}
