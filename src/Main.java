import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in =new Scanner(System.in);
        System.out.print("Enter size of array: ");
     int n =in.nextInt();
     int arr[] = new int[n];
    for (int i=0;i<n;i++){
        System.out.print("Enter element "+"["+i+"] : ");
        arr[i] =in.nextInt();
    }
        System.out.print("What is the num u want ? ");
        int num =in.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]==num){
                System.out.println("Found Index "+i);
                return;
            }
        }
        System.out.println("not found");


    }
}