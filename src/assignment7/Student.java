package assignment7;

public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private int studentIDNumber;
	
	private double bearBucksBalance;
	
	private double remainingBearBucks;
	
	private double grade;
	
	private int credits;
	
	private double qualityPoints;
	
	private int attemptedCredits;
	
	private int passingCredits;
	
	private double totalGradePointAverage;
	
	private String legacyName;
	
	public Student (String firstName, String lastName, int id)
	{
		this.firstName = firstName;
		
		this.lastName = lastName;
		
		this.studentIDNumber = id;
	}
	
	/**
	 * @return the student's full name
	 */
	
	public String getFullName ()	
	{
		return firstName + " " + lastName; 
	}
	
	/**
	 *  @return the student's last name
	 */
	
	public String getLastName ()
	{
		return lastName;
	}
	
	/**
	 * @return the student's id number
	 */
	
	public int getId()
	{
		return studentIDNumber;
	}
	
	/**
	 * @param the student's grade for that course and the course credit
	 * @return the student's grade for that course and the course credit
	 */
	
	public void submitGrade (double grade, int credits)
	{
		this.grade = grade;
		
		this.credits = credits;
		
		this.attemptedCredits = attemptedCredits + credits;
		
		this.qualityPoints = qualityPoints + grade * credits;
		
		if (grade > 1.7)
		{
			passingCredits = passingCredits + credits;
		}
	}
	
	/**
	 * @return the student's total credits taken
	 */
	
	public int getTotalAttemptedCredits ()
	{
		return attemptedCredits;
	}
	
	/**
	 * @return the student's total credits passed
	 */
	
	public int getTotalPassingCredits ()
	{
		return passingCredits;
	}
	
	/**
	 * @return the student's cumulative GPA
	 */
	
	public double calculateGradePointAverage ()
	{
		totalGradePointAverage = qualityPoints / attemptedCredits;
		
		return totalGradePointAverage;
		
	}
	
	/**
	 * @return the student's class standing
	 */
	
	public String getClassStanding ()
	{
		if (passingCredits < 30)
		{
			return "First Year";
		}
		
		else if (passingCredits >= 30 && passingCredits < 60)
		{
			return "Sophomore";
		}
		
		else if (passingCredits >= 60 && passingCredits < 90)
		{
			return "Junior";
		}
		
		else
		{
			return "Senior";
		}
	}
	
	/**
	 * @return if the student is eligible for Phi Beta Kappa or not
	 */
	
	public boolean isEligibleForPhiBetaKappa ()	
	{	
		if (credits >= 98 && grade >= 3.60)
		{
			return true;
		}
		
		else if (credits >= 75 && grade >= 3.80)
		{
			return true;
		}
		
		else
		{
			return false;
		}	
	}
	
	/**
	 * @param the amount of Bear Bucks the student adds to the account 
	 * @return the amount of Bear Bucks after adding
	 */
	
	public void depositBearBucks (double amount)
	{
		bearBucksBalance = bearBucksBalance + amount;
	}
	
	/**
	 * @param the amount of Bear Bucks the student uses
	 * @return the amount of Bear Bucks after using
	 */
	
	public void deductBearBucks(double amount)
	{
		bearBucksBalance = bearBucksBalance - amount;
	}
	
	/**
	 * @return the student's current Bear Buck balance
	 */
	
	public double getBearBucksBalance()
	{
		return bearBucksBalance;
	}
	
	/**
	 * @return the student's Bear Buck balance after cashing out
	 */
		
	public double cashOutBearBucks()
	{
		remainingBearBucks = bearBucksBalance;
		
		if (bearBucksBalance > 10)
		{	
			remainingBearBucks = bearBucksBalance - 10; 
			
			bearBucksBalance = 0;
			
			return remainingBearBucks;
						
		}
		
		else 
		{
			bearBucksBalance = 0;
			
			remainingBearBucks = 0;
			
			return remainingBearBucks;
		}
	}
	
	/**
	 * @param the student's first name, the student's future partner, if they want their child's name to be hyphenated, the student's id
	 * @return the student's future child
	 */
	
	public Student createLegacy (String firstName, Student otherParent, boolean isHyphenated, int id)
	{
		if (isHyphenated == true)
		{
			this.legacyName = this.lastName + "-" + otherParent.getLastName();
		}
		
		else
		{
			this.legacyName = this.lastName;
		}
		
		Student s = new Student (firstName, this.legacyName, id);
		
		s.bearBucksBalance = this.cashOutBearBucks() + otherParent.cashOutBearBucks();
		
		return s;
		
	}
	
	/**
	 * @return the student's full name and id number
	 */
	
	public String toString()
	{
		return getFullName() + studentIDNumber;
	}
	
	
	
	
	
}
