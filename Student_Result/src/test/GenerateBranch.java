package test;
public class GenerateBranch {
	public String br=null;
     public String generate(String brCode) {
    	 switch(brCode) {
    	 case "05" : br="CSE";
    		 break;
    	 case "04" : br = "ECE";
    		 break;
    	 case "02" : br = "EEE";
    		 break;
    	 }//end of switch
    	 return br;
     }
}
