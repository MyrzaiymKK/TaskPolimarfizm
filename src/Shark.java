public class Shark extends Animal{
    public void attact(){
        System.out.println("Shark attact for fish");
    }

    @Override
    public String toString() {
        return "Shark{} " + super.toString();
    }
}
