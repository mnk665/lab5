public class Person {
    private String name;
    private int ID;

    //constructors
    public Person(){
        name="";
        ID=0;
    }

    public Person(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    //getters
    public String getName() {return name;}
     public int getID() {return ID;}

     //setters
    public void setName(String name) {this.name = name;}
    public void setID(int ID) {this.ID = ID;}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                '}';
    }
}
