public class inheritance {
    public static void main(String[] args) {
        //inheritance = the process where one class acquires 
                        //the atributs and methods of another
        // noi chung la co 1 class co dc thuoc tinh cua class dang truoc
        Car car = new Car();
        car.go();  //this vehicle is moving
        Bicycle bicycle = new Bicycle();
        bicycle.stop(); // this vehicle is stop
        System.out.println(car.speed);// 0.0
        
        System.out.println(bicycle.speed);//0.0
        System.out.println(car.banhxe);// 4 neu doi lai banhxe>bandap la sai vi trong class car ko co ban dap
        
        System.out.println(bicycle.bandap);//2
        
    }
}
