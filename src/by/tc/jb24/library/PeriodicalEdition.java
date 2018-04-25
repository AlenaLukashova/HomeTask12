package by.tc.jb24.library;

public class PeriodicalEdition extends PrintEdition{
	private String periodical;
		
		public PeriodicalEdition(String title, String publisher, String periodical) {
			 super(title, publisher); 
			 this.periodical=periodical;
			 } 
		
		public String getPeriodical() {
			 return periodical; 
			 }  
		 
		 public void setPeriodical(String periodical) {
			 this.periodical = periodical; 
			 }  	 
	}
