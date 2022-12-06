public class Physics {
    public static void main(String[] args){
        double s;
        double t = 10.0;
        double s0 = 1.0;
        double v0 = 2.0;
        double a = 5.0;
        s = s0 + (v0 * t) + (1/2 * (a) * (t * t));
        System.out.println(s);
    }
}
