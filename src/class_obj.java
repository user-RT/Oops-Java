package src;//Create a class named Animal with an
// attribute name (String). Implement a method named makeSound() that prints "The animal makes a sound."


class Animal{
    String name;

    public void makesound(){
        System.out.println(name  +" makes a sound" );

    }
}


public class class_obj {
    public static void main(String[] args) {

        Animal bhau = new Animal();


        bhau.name="dog";
        bhau.makesound();

    }
}
