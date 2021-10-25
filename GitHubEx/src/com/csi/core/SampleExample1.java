package com.csi.core;
class MethodOverloadingConcept
{
	void get()
	{
		System.out.println("\n Method Overloading");
	}
	
	void get(int number)
	{
		System.out.println("\n Method_Overloading_Concept");
	}
}
public class SampleExample1 
{
	public static void main(String[] args) 
	{
		MethodOverloadingConcept m1 = new MethodOverloadingConcept();
		m1.get();
		m1.get(10);
	}
}
