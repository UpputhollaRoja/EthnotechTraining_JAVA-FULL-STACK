import java.util.LinkedList;
public class LL2 {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        students.add("Rose");
        students.add("Kavya");
        students.add("Sam");
        students.add("Sasi");
        System.out.println(students);
        System.out.println("First: "+students.getFirst());
        System.out.println("Last: "+students.getLast());
        students.removeFirst();
        students.removeLast();
        System.out.println(students);
    }   
}
    
