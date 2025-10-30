package Act4;

class Calculation extends Sales{
	
	@Override
	void GetAve() {
		double sum = 0;
		double ave = 0;
		
		for(double sale : Sales) {
			sum += sale;
		}
		ave = sum / Sales.length;
		System.out.println("Average: " + ave);
	}
	
	@Override
	void GetMaxValue() {
		double max = Sales[0];
		
		for(double val : Sales) {
			if (max < val) {
				max = val;
			}
		}
		System.out.println("Maximum Value: " + max);
	}
	
	@Override
	void GetMinValue() {
		double min = Sales[0];
		
		for(double val : Sales) {
			if (min > val) {
				min = val;
			}
		}
		System.out.println("Minimun Value: " + min);
	}
}
