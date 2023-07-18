import java.util.Scanner;

public class ElementRemoval {
    public static int costToRemoveElements(int[] a) {
        int cost = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        for (int i = 0; i < a.length; i++) {
            cost += sum;
            sum -= a[i];
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(costToRemoveElements(arr));
    }
}
