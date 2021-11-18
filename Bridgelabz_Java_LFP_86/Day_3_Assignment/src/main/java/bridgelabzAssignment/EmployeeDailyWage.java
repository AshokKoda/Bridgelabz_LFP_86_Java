package bridgelabzAssignment;

public class EmployeeDailyWage {

	public static void main(String[] args) {
		
		int Fulltime = 1;
		int RatePerHour = 20;
		
		int empHrs = 0;
		int empWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		
		if(empCheck == Fulltime)
			empHrs = 8;
		else
			empHrs = 0;
		
		empWage = empHrs * RatePerHour;
		System.out.println("Employee Wage: " + empWage);

	}

}
