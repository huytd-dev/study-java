public class Hero extends Person {
    // hero ke thua person nen chi can khai bao them power
    String power;
    Hero(String name, int age, String power){
        super(name,age);// vi ben person da co name age nen super ke thua qua day
        
        this.power = power;

    }
    public String toSring(){
        return super.toSring()+this.power;
    }
}
