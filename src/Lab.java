public class Lab extends Department {

    private String type;
    private int numberOfStudies;


    static{
        //here would be the initialization of the lab's database with information about the patient's studies
        // with this static block we can set/refresh the number of studies every time the class lab is loaded.

          System.out.println("Patient's Studies from lab");
    }

    public Lab(String name, String director, String type) {
        super(name,director);
        this.type = type;
    }


    public String getType() {
        return type;
    }
    // public void setNumberOfStudies(){}  we will set this method with the database information
    public int getNumberOfStudies(){return numberOfStudies;}
    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return "Name" + getName() + "Director: " + getDirector() + "Type: " + getType();
    }
}
