package Employee_Wage_day3;
import java.util.Random;

public class Emp_Uc8 {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	String company;
	int empRatePerHour;
	int numOfWorkingDays;
	int maxHoursPerMonth;

	public static void totalEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		Random random = new Random();
		int totalWorkingDays = 0;
		int totalWorkingHours = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		while (totalWorkingDays < numOfWorkingDays && totalWorkingHours < maxHoursPerMonth) {
			totalWorkingDays++;
			int empCheck = random.nextInt(3);
			int empHrs = 0;
			switch (empCheck) {

			case IS_PART_TIME : empHrs = 4;

			case IS_FULL_TIME : empHrs = 8;

			default : empHrs = 0;

			}
			totalWorkingHours = empHrs + totalWorkingHours;
			empWage = empHrs * empRatePerHour;

			System.out.println("day " + totalWorkingDays + " = " + empWage);
			totalEmpWage = empWage + totalEmpWage;

		}
		System.out.println("Salary of " + company + " Employee is " + totalEmpWage);

	}

	public static void main(String[] args) {
		public static final int IS_PART_TIME = 1;
		public static final int IS_FULL_TIME = 2;

		String company;
		int empRatePerHour;
		int numOfWorkingDays;
		int maxHoursPerMonth;
	}

		public static void totalEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
			Random random = new Random();
			int totalWorkingDays = 0;
			int totalWorkingHours = 0;
			int empWage = 0;
			int totalEmpWage = 0;

			while (totalWorkingDays < numOfWorkingDays && totalWorkingHours < maxHoursPerMonth) {
				totalWorkingDays++;
				int empCheck = random.nextInt(3);
				int empHrs = 0;
				switch (empCheck) {

				case IS_PART_TIME : empHrs = 4;

				case IS_FULL_TIME : empHrs = 8;

				default : empHrs = 0;

				}
				totalWorkingHours = empHrs + totalWorkingHours;
				empWage = empHrs * empRatePerHour;

				System.out.println("day " + totalWorkingDays + " = " + empWage);
				totalEmpWage = empWage + totalEmpWage;

			}
			System.out.println("Salary of " + company + " Employee is " + totalEmpWage);

		}

		public static void main(String[] args) {
			Emp_Uc8.totalEmpWage("Cognizant", 500, 28, 224);
			Emp_Uc8.totalEmpWage("TCS", 400, 28, 224);
			Emp_Uc8.totalEmpWage("Capgemini", 300, 28, 224);
			Emp_Uc8.totalEmpWage("Accenture", 100, 28, 252);totalEmpWage("Cognizant", 500, 28, 224);
		
}
	}
