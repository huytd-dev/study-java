public class Fish implements Prey, Predator {
    @Override
    public void Hunt(){
        System.out.println("*the fish it hunting by predator");
    }
    @Override
    public void flee(){
        System.out.println("*the fish is fleeing by prey*");
    }
}
