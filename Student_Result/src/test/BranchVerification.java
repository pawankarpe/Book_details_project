package test;

public class BranchVerification {
	 public boolean k=false;
     public boolean verify(String br) {
    	 switch(br) {
    	 case "CSE" : k=true;
    		 break;
    	 case "ECE" : k=true;
    		 break;
    	 case "EEE" : k=true;
    		 break;
    	 }//end of switch
    	 return k;
     }
}
