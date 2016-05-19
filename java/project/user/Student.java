package project.user;
import java.util.ArrayList;

import project.schedule.classes.Request;
import project.schedule.classes.SchoolClass;
import project.serverLogic.requestManager;
public class Student extends User
{
	
	public Student(String name, int year, int month, int date, int grade, String gender)
	{
		super(name, year, month, date, grade, gender);
	}

	private ArrayList<SchoolClass> StrugglingClasses;

	public void requestHelp(SchoolClass sClass)
	{
		Request request1 = new Request(this,sClass.getSubject(),true);
		requestManager.addRequest(request1);
	}
	
	public boolean setStruggle (SchoolClass sClass)
	{
		boolean found = false;
		for(int i = 0; i < this.StrugglingClasses.size(); i++)
		{
			if(sClass.equals(this.StrugglingClasses.get(i)))
			{
				found = true;
				
			}
		}

		for(SchoolClass c:this.cal.getClasses())
		{
			if(sClass.equals(c))
			{
				StrugglingClasses.add(sClass);
				return true;
			}
		}
		
		if(found == false)
		{
			StrugglingClasses.add(sClass);
			return found;
		}
		else
		{
			return found;
		}
	}
	
	public ArrayList<SchoolClass> returnStruggle()
	{
		if(StrugglingClasses.isEmpty())
		{
			System.out.println("This Student is not currently Struggling");
			return StrugglingClasses;
		}
		else
		{
			System.out.println("This student is currently Struggling");
			return StrugglingClasses;
		}
		
	}
	
	public void rateGuide()
	{
		//TODO finish rateGuide() when ReviewGuides works/is set up
	}
	
	public void rateGuide(Tutor placeholder, String review)
	{
		//TODO finish rateGuide(tutor, review) when tutor is set up
	}
}
