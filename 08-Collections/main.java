import java.util.ArrayList;
public class main{
    public static void main(String[] args){
        ArrayList<String> students=new ArrayList<>();
        students.add("Rose");
        students.add("Sam");
        students.add("Arun");
        students.add("Sai");
        students.remove("index:2");
        System.out.println(students);
        //access element
        System.out.println("First student: "+students.get(0));
        //change element
        students.set(1,"Ram");
        System.out.println("Updated students: "+students);
        //remove element
        students.remove(3);
        System.out.println("Students after removal: "+students);
        //search
        if(students.contains("Sai")){
            System.out.println("Sai is in the list");
    }
    //size
    System.out.println("Number of students: "+students.size());
}
}