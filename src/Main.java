import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please 5 integers N");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();

        List<Integer> numlist = new ArrayList<Integer>();
        numlist.add(a);
        numlist.add(b);
        numlist.add(c);
        numlist.add(d);
        numlist.add(e);

        int sum = a+b+c+d+e;

        while(true){
            System.out.println("Please select a mode of function");
            System.out.println("1, Absolute Value of Sum");
            System.out.println("2, Average of Sum");
            System.out.println("3, Highest Value of List");
            System.out.println("4, Lowest Value of List");
            System.out.println("5, Quit");
            int mode = scan.nextInt();

            if(mode == 1){
                System.out.println("ABS Mode toggled");
                int M1RSL = Math.abs(a+b+c+d+e);
                System.out.println(M1RSL);
            }
            else if(mode == 2){
                System.out.println("AVG mode toggled");
                int result = sum/5;
                System.out.println(result);
            }
            else if(mode == 3){
                System.out.println("HighVal mode toggled");
                System.out.println("MaxVal is: " + Collections.max(numlist, null));
            }
            else if(mode == 4){
                System.out.println("LowVal mode toggled");
                System.out.println("LowVal is: " + Collections.min(numlist, null));
            }
            else{
                System.out.println("Thanks for using the program!");
                break;
            }
        }
    }
}