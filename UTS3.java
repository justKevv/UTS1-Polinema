import java.util.Scanner;

public class UTS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;
        int counter=0;

        System.out.print("Insert your number : ");
        no  = sc.nextInt();

        // convert int to string
        String noname = Integer.toString(no);
        
        for (int i = 0; i < noname.length(); i++) {
            if (noname.charAt(i) % 2 == 0) {
                counter++;
            }
        }
        System.out.println("There are "+counter+" even digit number");
    }
}
