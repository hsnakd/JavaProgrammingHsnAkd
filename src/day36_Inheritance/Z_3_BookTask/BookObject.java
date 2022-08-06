package day36_Inheritance.Z_3_BookTask;

public class BookObject {
    public static void main(String[] args) {
        AudioBook audioBook = new AudioBook("qwerty", "asdfg", "zxcvbn", 10, "qaz", "wsx");
        EBook eBook = new EBook("asdfg", "qwerty", "edcrfv", 15, "yhn", 400);

        System.out.println(audioBook);
        System.out.println(eBook);

    }
}
