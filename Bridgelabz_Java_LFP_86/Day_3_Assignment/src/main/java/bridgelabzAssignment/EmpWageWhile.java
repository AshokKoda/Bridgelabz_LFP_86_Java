package bridgelabzAssignment;

public class EmpWageWhile {
	public static final int PartTime = 1;
	public static final int FullTime = 2;
	public static final int RatePerHour = 20;
	public static final int NumOfWorkingDays = 20;
	public static final int HrsInMonth = 100;

	public static void main(String[] args) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		while(totalEmpHrs <= HrsInMonth && totalWorkingDays < NumOfWorkingDays) {
			totalWorkingDays++;
			
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
			totalEmpHrs += empHrs;
			System.out.println("Day: " + totalWorkingDays + " Emp Hour: " + empHrs);
		}

		int totalEmpWage = totalEmpHrs * RatePerHour;
		System.out.println("TOtal Emp Wage: " + totalEmpWage);
	}

}
