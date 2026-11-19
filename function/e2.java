// Inheritance example


package function;

public class e2 {
   
    class animal{
        void sound(){
            System.out.println("Animal makes a sound");
        }
        class dog extends animal {
            void sound(){
                System.out.println("Dog barks");
            }
        }
    }
    
    public static void main(String args[]){
        e2 obj = new e2();
        e2.animal dog = obj.new animal().new dog();
        dog.sound();    
    }
}
