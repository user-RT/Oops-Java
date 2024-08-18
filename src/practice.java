package src;
class school{
    int rollno;
    String name;

    public void section(){
        System.out.println("rollno and name  is:" + rollno + name);

    }
}
public class practice {
    public static void main(String[] args) {
    school sc = new school();
    sc.rollno = 1;
    sc.name ="Ravi";

    sc.section();

    }

}
