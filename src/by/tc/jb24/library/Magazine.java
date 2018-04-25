package by.tc.jb24.library;

public class Magazine extends PeriodicalEdition {
	private int numberOfMagazine; 
	 
	public Magazine(String title, String publisher, String periodical, int numberOfMagazine) {   
		super(title,publisher,periodical);   
		this.numberOfMagazine = numberOfMagazine;  
		} 
	 
	 public int getNumber() {   
		 return numberOfMagazine;  
		 }  
	 
	 public void setNumber(int numberOfMagazine){
		 this.numberOfMagazine=numberOfMagazine;
	 }
}
