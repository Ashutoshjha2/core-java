package Store;
public class BookStore
{
private int ID;
private String BooksName;
private String BooksQuality;
private String Author;
private String Editor;
private String Referance;

public BookStore(int iD, String booksName, String booksQuality, String author, String editor, String referance) {
	super();
	ID = iD;
	BooksName = booksName;
	BooksQuality = booksQuality;
	Author = author;
	Editor = editor;
	Referance = referance;
}
public BookStore() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "BookStore [ID=" + ID + ", BooksName=" + BooksName + ", BooksQuality=" + BooksQuality + ", Author=" + Author
			+ ", Editor=" + Editor + ", Referance=" + Referance + "]";
}

}
