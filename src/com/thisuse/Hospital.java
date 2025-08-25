package com.thisuse;

public class Hospital {
	private int  PatientId;
	private String PatientName;
	private String Gendar;
	private int Age;
	public Hospital(int patientId, String patientName, String gendar, int age)
	{
		if(patientId<0)
		{
			System.err.println("The Id must be Positive");
			System.exit(0);
			
		}
		if(patientName==null|| patientName.trim().isEmpty()|| patientName.equals(null))
		{
			System.err.println("The Patient Name is not empty or null");
		System.exit(0);
		}
		if(Gendar==null|| Gendar.trim().isEmpty()|| Gendar.equals(null))
		{
			System.err.println("The Patient Gendar is not empty or null");
			System.exit(0);
		}
		if(Age<0)
		{
			System.err.println("The Age must be Positive");
			System.exit(0);
		}
		
		this.PatientId = patientId;
		this.PatientName = patientName;
		this.Gendar = gendar;
		this.Age = age;
	}
	@Override
	public String toString() {
		return "Hospital\n [PatientId=" + PatientId + ", PatientName=" + PatientName + ", Gendar=" + Gendar + ", Age="
				+ Age + "]";
	}
	
	
	

}
