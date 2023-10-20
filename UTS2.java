public class UTS2 {
    public static void main(String[] args) {
        double hasil=0.0;
        double i=0.0,j=0.0;
        for (i = 1.0; i <= 99.0; i++) {
            hasil += i;
        }
        for (j = 2.5; j < i; j++) {
            hasil += j;
        }
        System.out.println(hasil);
    }
}
