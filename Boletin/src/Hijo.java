public class Hijo extends Padre{
    private int i;
    public Hijo(int i) {
        this.i = i;
    }
    public String toString() {
        return super.toString() + ",i:" + i;
    }
}