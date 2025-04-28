import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
class StringRepeat{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print length array: ");
        int len1 = scanner.nextInt();
        int[] array1 = new int[len1];
        System.out.print("Print the number array: ");
        for (int i = 0; i < len1; i++) {
            array1[i] = scanner.nextInt();
        }
        int sm = IntStream.of(array1).sum();
        int mx = IntStream.of(array1).max().orElse(0);
        int mn = IntStream.of(array1).min().orElse(0);
        int res = sm - mx - mn;
        if (array1.length == 1 || array1.length < 1) {
            System.out.println("0");
        }
        else {System.out.println("sum numbers except min, max: " + res);}
    }
}


