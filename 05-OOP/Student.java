public class Student{
        String name;
        int age;
        float attendance;
        String mood;
        int energy;
        Student(String name,int age,float attendance,String mood,int energy){
            this.name=name;
            this.age=age;
            this.attendance=attendance;
            this.mood=mood;
            this.energy=energy;
        }   
        void skipClass(){
            if(energy<5){
                System.out.println("I will skip class");
            }
        }
        void takeRest(){
            if(attendance>85){
                System.out.println( "I will take rest");
            }
        }
        void sleep(){
            if(energy<2 && mood=="sleepy")
            {
                System.out.println("I am feeling sleepy");
            }
        }
        void study(){
        {
            if(energy>5 && mood=="ambitious"){
                System.out.println("I am going to study to achieve that ambition");
            }
        }
    }
    public static void main(String[] args){
        Student student1=new Student("sai",20,90.5f,"ambitious",6);
        student1.skipClass();
        student1.takeRest();
        student1.sleep();
        student1.study();
    }
}