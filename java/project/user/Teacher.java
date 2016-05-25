/**
 * 
 * @author george
 * object for Teacher
 *
 */

package project.user;

import project.serverLogic.userFactory;

public class Teacher
{ //we may not even need this, but its nice to have (just in case)
	private String name;
	private String school;
	
	/**
	 * basic constructor 
	 * @param n
	 * @param school
	 * @param g
	 */
	
	public Teacher(String n, String school)
	{
		this.name = n;
		this.school = school;
	}
	
	public Teacher(String n)
	{
		this.name = n;
	}
	
	/**
	 * no parameter constructor (mainly for testing)
	 */
	
	public Teacher()
	{
		this("test_teacher", "GHS");
	}
	
	/**
	 * allows the teacher to rate a tutor
	 * @param placeholder
	 * @param score
	 * @param review
	 */

	public String getName() 
	{
		return name;
	}
	
	public void removeMyself()
	{
		userFactory.removeTeacher(this);
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSchool()
	{
		return school;
	}

	public void setSchool(String school) 
	{
		this.school = school;
	}
}
