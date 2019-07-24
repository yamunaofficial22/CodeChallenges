public class Challenge4 {

	static int hourlyPay = 2000;
	static double slab_hike_percentage = 1.1;
	static int slab1 = 40;
	static int slab2 = 50;
	static int slab3 = 60;

	public static double calculateSalary(float hoursWorked) {
		double result = 0;
		/*
		 * Complete this method to calculate the salary for the week.
		 * Note: An employee is expected to work for atleast 40 hours per week, failing to do so, a fine will be incurred. 
		 * Below is how the fine is calculated
		 * Fine = (40 - hours_worked) * gross_pay / 100
		 */
		 if(hoursWorked == slab1){
			 result = hoursWorked * hourlyPay;
		 }
		 else if(hoursWorked > slab1 && hoursWorked <= slab2){
			result = hoursWorked * (hourlyPay * slab_hike_percentage); 
		 }
		 else if(hoursWorked > slab2 && hoursWorked <= slab3){
			 result = hoursWorked * (hourlyPay * slab_hike_percentage * slab_hike_percentage);
		 }
		 else if(hoursWorked > slab3){
			 result = hoursWorked * (hourlyPay * slab_hike_percentage * slab_hike_percentage * slab_hike_percentage);
		 }
		 else{
			double fine = ((40 - hoursWorked) * 80000)/100;
			result = 80000 - fine;
		 }
		return result;
	}
	
	public static void main (String arg[])
	{
		double pay1 = calculateSalary(36);
		System.out.println("Pay for 36 hours work: "+pay1);
		
		double pay2 = calculateSalary(45);
		System.out.println("Pay for 45 hours work: "+pay2);
		
		double pay3 = calculateSalary(54);
		System.out.println("Pay for 54 hours work: "+pay3);
		
		double pay4 = calculateSalary(68);
		System.out.println("Pay for 68 hours work: "+pay4);
	}
}