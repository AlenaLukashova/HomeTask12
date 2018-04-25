package by.tc.jb24.main;

import java.util.List;

import by.tc.jb24.library.Book;
import by.tc.jb24.library.Magazine;
import by.tc.jb24.library.PrintEdition;
import by.tc.jb24.library.Library;
import by.tc.jb24.services.find.FindByTitle;
import by.tc.jb24.services.Services;
import by.tc.jb24.view.PrintAsList;
import by.tc.jb24.view.PrintAsTable;
import by.tc.jb24.view.ViewAction;

public class Main {

	public static void main(String[] args) {
		Library myLibrary = new Library();

		myLibrary.add(new Book("Java Basics", "ABC", "Smolyakova", 2016, 275));
		myLibrary.add(new Book("C#", "ABC", "Ivanov", 2017, 985));
		myLibrary.add(new Magazine("Science", "AAAS", "Monthly", 87));
		myLibrary.add(new Magazine("Java Basics", "XYZ", "Monthly", 25));

		//myLibrary.remove(new Book("Java Basic", "ABC", "Smolyakova", 2016, 275));

		Findable match = new FindByTitle("Java Basics");
		Services findMatcher = new Services();
		List<PrintEdition> resultUnits = findMatcher.find(myLibrary, match);

		System.out.println("Number of found results: " + resultUnits.size());

		ViewAction.print(new PrintAsList(), resultUnits);
		ViewAction.print(new PrintAsTable(), resultUnits);
	}
}