public class Main {
    public static void main(String[] args) {


//        Person jane  = new Person();
//        jane.setName("Jane");
//        Person jin = new Person();
//        jin.setName("Jin");
//        Person joe = new Person();
//        joe.setName("Joe");
//        Person John  = new Person();
//        John.setName("John");
//        John.setKids( new Person[]{jane,jin,joe});
//        John.setDob("19/02/1990");
//        System.out.println(John);

        Person jane = new Person("Jane","01/01/1930");
        Person jim = new Person("Jim","02/02/1932");
        Person joe = new Person("Joe", "04/04/1930");
        Person[] JohnKinds = {jane,jim,joe};
        Person john = new Person("John", "05/05/1900", JohnKinds);
        System.out.println(john);


    }
}