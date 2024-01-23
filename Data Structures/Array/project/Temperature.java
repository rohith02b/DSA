public class Temperature {
	public double average_temperature;
	private double[] temperatures;

	public Temperature(int days) {
		temperatures = new double[days];
	}

	public void insert(int index,double value)
	{
		try {
			temperatures[index] = value;
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public double find_average() {
		int sum = 0;
		for(int i=0;i<temperatures.length;i++)
			sum += temperatures[i];

		this.average_temperature = sum / temperatures.length;
		return this.average_temperature;
	}

	public int number_of_days_above_average() {
		int total = 0;
		for(int i=0;i<temperatures.length;i++)
		{
			if(temperatures[i] > this.average_temperature)
				total++;
		}

		return total;
	}
}

	
