public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,true,"red",10);
        Fan fan2 = new Fan(2,false,"blue",5);
        Fan fan3 = new Fan();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        fan3.setOn(true);
        System.out.println(fan3.toString());
    }
}
