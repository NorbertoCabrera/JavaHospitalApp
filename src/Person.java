public class Person {
    protected String firstName;
    protected String lastName;




    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final void salute(){
        System.out.println("good morning, my name is :"+this.firstName+" and my las name is :"+this.getLastName());
    }

}
