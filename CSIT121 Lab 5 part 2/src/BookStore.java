import java.util.Arrays;
import java.util.LinkedList;

public class BookStore {
    public static void main(String[] args) {
        //creating 4 Book objects
        LinkedList<Book> list1;
        Book b1=new Book("I Heard You Paint Houses","Charles Brandt",2004);
        Book b2=new Book("The Lord of The Rings, The Fellowship of the Ring","J. R. R. Tolkien",1954);
        Book b3=new Book("Mindhunter: Inside the FBI's Elite Serial Crime Unit","John E. Douglas, Mark Olshaker",1995);
        Book b4=new Book("Harry Potter and the Philosopher's Stone","J.K. Rowling",1997);

        //adding to the linked list
        list1=new LinkedList<Book>(Arrays.asList(b1,b2,b3,b4));

        //printing the list
        for(Book b:list1)
            System.out.println(b);

        //creating 2 more books
        Book b5=new Book("A Monster Calls","Patrick Ness",2018);
        Book b6=new Book("Metro 2033","Dmitry Glukhovsky",2005);

        //pushing them into the list
        list1.push(b5);
        list1.push(b6);
        System.out.println("\n");

        //printing the list
        for(Book b:list1)
            System.out.println(b);
        System.out.println("\n");

        //returning the first and last element of the list
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());

        //popping 3 elements from the list
        list1.pop();
        list1.pop();
        list1.pop();
        System.out.println("\n");

        //printing the list
        for(Book b:list1)
            System.out.println(b);

        //clearing the list
        list1.clear();

        System.out.println("\n");
        //using .peekFirst()
        System.out.println(list1.peekFirst());
        //peekfirst() retrieves but does not remove the first element of the list,or returns null if the list is empty





    }
}
