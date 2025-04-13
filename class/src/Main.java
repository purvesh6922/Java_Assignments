class calculator{

    public int add(int num1,int num2){
        int r=num1+num2;
        return r;
    }
}
public class Main {
    public static void main(String[] args) {
        int num1=5;
        int num2=3;

        calculator clc=new calculator();
      int  result= clc.add(num1,num2);
        System.out.println(result);
    }
}