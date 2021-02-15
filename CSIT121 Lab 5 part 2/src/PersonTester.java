import java.util.*;

public class PersonTester {
    public static void main(String[] args) {
        //created 6 person objects
        Person p1=new Person("Nihal",1);
        Person p2=new Person("Richard Nixon",2);
        Person p3=new Person("John Marston",3);
        Person p4=new Person("Kinder Joy",4);
        Person p5=new Person("Master Chief",5);
        Person p6=new Person("Lara Croft",6);

        //adding to the list
        ArrayList<Person> List= new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6));

        //printing the list
        for(Person p:List)
            System.out.println(p);

         //removed the first and third element and printed the list
        List.remove(0);
        List.remove(1);
        System.out.println("\n\n");
        for(Person p:List)
            System.out.println(p);

        //creating a new person object
        Person p7=new Person("Kennedy",7);

        //adding new object at index 3
        List.add(2,p7);
        System.out.println("\n\n");

        //printing the list
        for(Person p:List)
            System.out.println(p);

        System.out.println("\n\n");

        //printing the size of the arraylist
        System.out.println("The Size of the array is "+List.size());

        //setting new values for 2nd element of the arraylist
        for(Person p:List){
            if(List.indexOf(p)==1)
            {
                p.setName("John Smith");
                p.setID(12345);
            }
        }
        System.out.println("\n\n");

        //printing list
        for(Person p:List)
            System.out.println(p);





    }
}
