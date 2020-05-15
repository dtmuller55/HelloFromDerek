package Derek;
//A friendly introduction class
public class HelloFromName {
    public void Hello(final String name){
        System.out.printf("Hello, my name is " + name + "%n");
    }

    public static void main(String []args){
        HelloFromName hello = new HelloFromName();
        hello.Hello("Derek");
    }

    public void HelloNeighbor(final String to, final String from){
        System.out.printf("Hello " + to + ", my name is " + from + "%n");
    }

}
