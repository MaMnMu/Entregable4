	public static void min(double nums[])
	{
		double min = nums[0];
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] < min)
				min = nums[i];
		}
		System.out.println("El numero minimo de la lista es " + min);
	}
	
	public static void max(double nums[])
	{
		double max = nums[0];
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] > max)
				max = nums[i];
		}
		System.out.println("El numero maximo de la lista es " + max);
	}