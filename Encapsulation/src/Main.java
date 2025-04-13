class student{
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name=newName;
    }
}
public class Main {

    public static void main(String[] args) {
        student s=new student();
        s.setName("");
        System.out.println(s.getName());
    }
}


