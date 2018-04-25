package by.tc.jb24.filereader;

import java.io.*;

import by.tc.jb24.library.Book;
import by.tc.jb24.library.Library;

public class BookReader {
	public static void main(String[] args) throws Exception {
		try {
			File file = new File("C:\\Users\\Alena\\workspace\\HomeTask1011\\src\\books.txt");
			FileReader read = new FileReader(file);
			BufferedReader breader = new BufferedReader(read);
			Library library = new Library();
			String temp;
			while ((temp = breader.readLine()) != null) {
				String[] parts = temp.split("<sep/>");
				String title = parts[0]; 
				String publisher = parts[1]; 
				String author = parts[2]; 
				String publicationYear = parts[3]; 
				String page = parts[4];
				Book book = new Book(title, publisher, author, publicationYear,page);

				library.add(book);

				System.out.println(book);
			}

			breader.close();
		} catch (IOException ex) {
			System.out.println("Something wrong with file");
		}
	}
}
