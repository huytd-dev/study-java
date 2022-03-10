public class overloadmethod {
    public static void main(String[] args) {
        //overloadmethod = methods that share the same name but diff parameter
        //                 methods name+ parameter = methods signature
    //    int x = add(1,2);
    //    int y = add(1,2,3);
       int z = add(1,2,3,4);// int -> double, float....
       
    //    System.out.println(x);
    //    System.out.println(y);
       System.out.println(z);
    //    System.out.println(o);
    }

    static int add(int a, int b){               //ham add a+b
        System.out.println("this is overloaded methods #1");
        return a+b;                             
    }
    static int add(int a, int b, int c){  
        System.out.println("this is overloaded methods #2");

        return a+b+c;                           // ham add a+b+c
    }
    static int add(int a, int b, int c, int d){
        System.out.println("this is overloaded methods #3");

        return a+b+c+d;                             // sum a+b
    }
    
    
}
