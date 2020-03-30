package test;

public class MyPerson {
    private MyPerson person;
    public void setPerson(Object person) {
        this.person = (MyPerson) person;
        System.out.println("setPerson exe");
    }
}
