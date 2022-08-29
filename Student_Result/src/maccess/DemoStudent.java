package maccess;
import java.util.*;
import test.*;
public class DemoStudent {
	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the Student RollNo:");
       String rollNo = s.nextLine();
       if(rollNo.length()==10)
       {
    	  System.out.println("Enter the Student Name:");
    	  String name = s.nextLine();
    	  System.out.println("Enter the Branch:");
    	  String branch = s.nextLine().toUpperCase();
    	  BranchVerification bv = new BranchVerification();
    	  boolean k = bv.verify(branch);
    	  if(k)
    	  {
    		GenerateBranch ob = new GenerateBranch();
    		String br = ob.generate(rollNo.substring(6, 8));
    		if(br==null)
    		{
    			System.out.println("Invalid brCode in rollNo..");
    		}//end of if
    		else
    		{
    			if(br.equals(branch)) 
    			{
    				int i=1,totMarks=0;
    				boolean p=false;
    				while(i<=6)
    				{
    					System.out.println("Enter Marks of sub"+i);
    					int sub = s.nextInt();
    					if(sub<0 || sub>100)
    					{
    						System.out.println("Invalid Sub Marks..");
    						continue;
    						//skip below lines in iteration
    					}
    					if(sub>=0 && sub<=34)
    					{
    						p=true;
    					}
    					totMarks = totMarks+sub;
    					i++;
    				}//end of loop
    				
    				System.out.println("RollNo:"+rollNo);
    				System.out.println("Name:"+name);
    				System.out.println("Branch:"+branch);
    				System.out.println("TotMarks:"+totMarks);
    				float per = (float)totMarks/6;
    				System.out.println("Per:"+per);
    				StudentResult sr = new StudentResult();
    				String result = sr.generate(per, p);
    				System.out.println("Result:"+result);
    			}//end if
    			else
    			{
    				System.out.println
    				("RollNo not matched with branch");
    			}
    		}
    	  }//end
    	  else
    	  {
    		  System.out.println("Invalid branch...");
    	  }
       }//end of if
       else
       {
    	   System.out.println("Invalid RollNo...");
       }
       s.close();
	}
}
