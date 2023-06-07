package dev.lap;

public class Parent {

    static {
        System.out.println("Parent ");
    }
    private final String name;
    private final String dob;

    protected final int siblings;

//    {
//        name = "John";
//        dob = "01/01/1999";
//    }

    public Parent(String name, String dob, int siblings){
        this.name = name;
        this.dob = dob;
        this.siblings = siblings;
    }
    public String getName() {
        return name;
    }



    public String getDob() {
        return dob;
    }



    @Override
    public String toString() {
        return "name = "+name+" dob="+dob;
    }
}
