package com.copyConstractor;

public class Sourcing
{
	private int sourceId;
	private String sourcaName ;
	private double basicSalary ;
	private double HRAPer ;
	private double DAPer ;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;
	
	
	public Sourcing(int sourceId, String sourcaName, double basicSalary, double hRAPer, double dAPer,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sourceId = sourceId;
		this.sourcaName = sourcaName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}


	public double calculateGrossSalary()
	{
		double GrossSalary=basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)
;
		return GrossSalary;
	}


	@Override
	public String toString() {
		return "Sourcing [sourceId=" + sourceId + ", sourcaName=" + sourcaName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", enrollmentTarget=" + enrollmentTarget
				+ ", enrollmentReached=" + enrollmentReached + ", perkPerEnrollment=" + perkPerEnrollment + "]";
	}

}
