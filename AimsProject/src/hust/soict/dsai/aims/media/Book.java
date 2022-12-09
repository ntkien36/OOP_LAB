package hust.soict.dsai.aims.media;
import java.util.*;

public class Book extends Media {
	public Book() {
		// TODO Auto-generated constructor stub		
	}
	private List<String> authors = new ArrayList<String>();
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public void addAuthor(String authorName) {
		if(authors.contains(authorName)) {
			System.out.println("Author already got!");
		}
		else {
			authors.add(authorName);
		}
	}
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			int t = authors.indexOf(authorName);
			authors.remove(t);
			}
		else {
			System.out.println("No such author exist!");
			}
		}
	@Override
    public String toString() {
        StringBuilder author = new StringBuilder();
        for(String a:authors){
            author.append(a).append(" ");
        }
        return this.id + ". DVD - "
                + this.title + " - "
                + author + " - "
                + this.category + " - "
                + this.cost + " $";
    }
}
