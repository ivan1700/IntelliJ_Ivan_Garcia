public class Padre extends Abuelo {
    public Padre() {
    }
    public Padre(String s) {
        super(s);
    }
    public String toString(int i) {
        return "padre" + super.toString();
    }
}