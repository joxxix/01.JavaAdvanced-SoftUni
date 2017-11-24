
public class p08_Lottery {
    public static void main(String[] args) {
        int n = 291;
        int p = 4;
        int mask = 1 << p;
        int result = n | mask;
        System.out.println(result);
    }
}
