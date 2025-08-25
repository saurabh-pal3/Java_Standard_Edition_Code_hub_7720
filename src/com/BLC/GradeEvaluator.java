package com.BLC;

public class GradeEvaluator {

	public static char GradeEvaluator(int marks)
	{
		if(marks>=90)
		{
			return 'A';
		}
		else if(marks>=75)
		{
			return  'B';
		}
		else if(marks>=60)
		{
			return 'c';
		}
		else
		{
			return 'D';
		}
			
			
		
	}

}
