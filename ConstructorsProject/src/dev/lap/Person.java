package dev.lap;

public record Person(String name, String dob) {

    public Person(Person p){
        this(p.name, p.dob);
    }

    public Person{
        if(dob == null) throw  new IllegalArgumentException("Bad data");
        dob = dob.replace("-","/");

    }
}
