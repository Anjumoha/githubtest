package Test;



abstract class Lecture
{
    
    public String subject;
    
    public abstract void takeLecture();
    
    public abstract void askQuestions();
    
    public abstract void clearDoubts();
    
    public abstract void giveAssignments();
    
     public final void isWorkingDay(boolean workingday)
    {
        if(workingday)
        {
            System.out.println("Lecture Will Be conducted in Lecture Hall At School");
        }
        else
        {
            System.out.println("No School. There will be Online Class");
        }
        takeLecture();
        askQuestions();
        clearDoubts();
        giveAssignments();
    }
}

class OnlineLecture extends Lecture
{
    @Override
    public void takeLecture()
    {
         System.out.println("Lecture Started using Google Meet");
    }
    
     @Override
    public void askQuestions()
    {
         System.out.println("Teacher Ask questions to students attending the online Lecture");
    }
    
      @Override
    public void clearDoubts()
    {
         System.out.println("Teacher clear doubts to students attending the online Lecture");
    }
    
      @Override
    public void giveAssignments()
    {
         System.out.println("Teacher give assignments to students through google Docs"    );
    
    }
}

class RegularLecture extends Lecture
{
    @Override
    public void takeLecture()
    {
         System.out.println("Lecture Started at lecture Hall");
    }
    
     @Override
    public void askQuestions()
    {
         System.out.println("Teacher Ask questions to students present in Lecture Hall");
    }
    
      @Override
    public void clearDoubts()
    {
         System.out.println("Teacher clear doubts to students present in Lecture Hall");
    }
    
      @Override
    public void giveAssignments()
    {
         System.out.println("Teacher give assignments to students via printed Docs"    );
    
    }
}
public class LectureMain {
    public static void main(String[] args)
    {
        Lecture olecture = new OnlineLecture();
        olecture.isWorkingDay(false);
        System.out.println("================================================================================");
        Lecture rlecture = new RegularLecture();
        rlecture.isWorkingDay(true);
    }
}
