//Upadted by Shubham Parab
package com.csi.core;
class MethodOverloadingConcept
{
	void get(String name)
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
		m1.get("Shubham");
		m1.get(10);
	}
}
