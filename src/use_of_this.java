package src;

class Men{             // class name Men is created
    String name;
    int id;

    public void meninfo(){               // method is added

        System.out.println(this.name);     // use of .this to show from where to take name and id
        System.out.println(this.id);


    }
}
public class use_of_this {
    public static void main(String[] args) {

        Men sc = new Men();   // object name sc is created
        sc.name = "ravi";
        sc.id = 1;
        sc.meninfo();           // method is called
    }
}

