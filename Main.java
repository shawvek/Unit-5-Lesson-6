import java.io.*;
import java.util.*;
import static java.lang.System.*;
class Main {
  public static void main(String[] args) {
    
        Scanner it=new Scanner(System.in);
        Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288,true);
        Book b2 = new Book("I am Malala", "Bob", 2113, 298,false);
        System.out.println(b);
        
        Book g=new Book("The Godfather", "Mario Puzo", 2002, 448,false);
        System.out.println(g);

        System.out.println("Numpages of the Godfather: "+g.getNumPages());

        System.out.println("Is Malala hardcover: "+b.getHardCover());

        System.out.println("Enter new number of pages for Malala:");
        int np=it.nextInt();
        b.setNumPages(np);
        System.out.println(b);
        Scanner it2=new Scanner(System.in);
        System.out.println("Change Author for The Godfather:");
        String a=it2.nextLine();
        g.setAuthor(a);
        System.out.println(g);

        System.out.println("Are the books equal?"+ b.equals(b));
        System.out.println("Are the books equal?"+ b.equals(g));
        System.out.println("Are the books equal?"+ b.equals(b2));

        //making some Default Books
        Book def1=new Book();
        Book def2=new Book();
        System.out.println("This is Default Book 1"+def1);
        System.out.println("This is Default Book 2"+def2);
        System.out.println("Are the default books equal?"+ def1.equals(def2));

        //Create Library
        Library lib=new Library();
        System.out.println(lib);

        //add books to our library
        lib.addBooks(b);
        lib.addBooks(b2);
        lib.addBooks(g);
        lib.addBooks(def1);
        lib.addBooks(def2);
        lib.addBooks(b);
        lib.addBooks(b2);
        lib.addBooks(g);
        lib.addBooks(def1);
        lib.addBooks(def2);
        lib.addBooks(def2);

        System.out.println(lib);


  }
}