package Employee_Wage_day3;

public class Emp_Present_Or_Absent {

	public static void main(String[] args) {
		 int fulltime=1;
		 
		 double empcheck=Math.floor(Math.random()*10)%2;
		 if(empcheck == fulltime)
		 {
			 System.out.println("Employee is present");
			
		 }
		 else {
			 System.out.println("Employee is absent");
		 }

		}

	}


