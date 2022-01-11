public class Library
{
  //instance data
  private String name;
  private String address;
  private Book[] books;
  private static int numBooks=0;

  public Library()
  {
    this("unknown","unknown",10);
  }

  public Library(String n,String a,int x)
  {
    this.name=n;
    this.address=a;
    this.books=new Book[x];

  }

  public void addBooks(Book b)
  {
    books[numBooks]=b;
    numBooks++;
  }
  public String toString()
  {
    String it="";
    for(Book i:books){
      it+=i+"\n";
    }
    return it;

  }
}