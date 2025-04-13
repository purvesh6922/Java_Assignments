class human{
    private int age;
    private String name;

    public human(){
        age=12;
        name="Harry";
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

}
public class Main {
    public static void main(String[] args) {
    human h=new human();
        System.out.println(h.getAge());
    }
}