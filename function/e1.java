package function;

public class e1 {
    
    class calculator {
        int add(int a, int b){
            return a + b;
        }
    }
        int add(int a, int b, int c){
            return a + b + c;
        }

        public static void main(String args[]){

            e1 obj = new e1();
            e1.calculator calc = obj.new calculator();
            System.out.println(calc.add(5, 10));
            System.out.println(obj.add(5, 10, 15));
        }
}
