package Derek;

public class HelloFromName {
    public void Hello(final String name){
        System.out.print("Hello, my name is " + name);
    }

    public static void main(String []args){
        HelloFromName hello = new HelloFromName();
        hello.Hello("Derek");
    }
}
