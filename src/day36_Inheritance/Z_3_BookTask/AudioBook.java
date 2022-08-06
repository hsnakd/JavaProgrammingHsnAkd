package day36_Inheritance.Z_3_BookTask;

public class AudioBook extends BookClass{
    private String length;
    private String narrator;

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public AudioBook(String title, String type, String author, double price, String length, String narrator) {
        super(title, type, author, price);
        setLength(length);
        setNarrator(narrator);
    }

    public void listen() {
        System.out.println("Listening " + getTitle());
    }
}
/*
3.3 Create a subclass of Book named AudioBook:
			variables:
				title, type, author, price, length, narrator

			Methods:
				setInfo()
				listen()
				toString()
 */