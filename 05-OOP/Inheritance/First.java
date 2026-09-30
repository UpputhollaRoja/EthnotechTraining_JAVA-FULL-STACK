package ifelse.oops;
public class First{
    public static void main(String[] args){
        class animal{
            void sound(){
                System.out.println("Animal makes a sound");
            }
        }
        class dog extends animal{
            void sound(){
                System.out.println("Dog barks");
            }
        }
    }
}