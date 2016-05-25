/**
 * 
 * @author george
 * object for Tutor
 *
 */

package project.user;

import java.util.ArrayList;

import javax.security.auth.Subject;

import project.schedule.classes.SchoolClass;
import project.serverLogic.userFactory;
import project.studyGuide.StudyGuide;
import project.studyGuide.TutorReview;

public class Tutor extends User
{
	private ArrayList<SchoolClass> strongClasses;
	private ArrayList<TutorReview> reviews;
	private ArrayList<StudyGuide> Guides;
	
	/**
	 * calles super constructor
	 * @param name
	 * @param year
	 * @param month
	 * @param date
	 * @param grade
	 * @param gender
	 */
	
	public Tutor(String name, int grade)
	{
		super(name, grade);
	}
	
	public boolean addStrongClass(SchoolClass newClass)
	{
		for(SchoolClass c:this.strongClasses)
		{
			if(c.equals(newClass)) 
			{
				return false;
			}
		}
		strongClasses.add(newClass);
		return true;	
	}
	
	/**
	 * adds review for the Tutor
	 * @param re review of tutor.
	 */
	public void addReview(TutorReview re)
	{
		for(TutorReview r: this.reviews)
		{
			if(re.getStudent().equals(r.getStudent()));
			{
				return;
			}
		}
		reviews.add(re);
	}
	
	public void removeMyself()
	{
		userFactory.removeTutor(this);
	}
	
	/**
	 * 
	 * @param sub generates a new study guide
	 * @param comment
	 */
	public void submitGuide(project.schedule.classes.Subject sub, String comment)
	{
		Guides.add(new StudyGuide(this, sub, comment));
	}
}
