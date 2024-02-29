import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        {   int c=0;
            System.out.print("Enter the array's size: ");
            int n = in.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the elements: " );
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            // Print the first element of an array ( input: [1, 2, 3, 4, 5]  -  output: 1 ).
            System.out.println("The first element is: "+arr[0]);

            // Print the even numbers of an array ( input: [1, 2, 3, 4, 5]  -  output: 2  4  5 ).
            System.out.print("the even numbers of an array are : ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                    c++;
                }
            }
            if(c==0){
                System.out.print("NULL");
            }
            System.out.println();
            System.out.println("------------------------------------------------------------------------");
        }
        {
            // Merge 2 Arrays together ( input: [1, 2, 3], [4, 5, 6]  -  output: [1, 2, 3, 4, 5, 6] ).
            System.out.print("Enter the size of first array: ");
            int n1 = in.nextInt();
            System.out.print("Enter the size of second array: ");
           int n2 = in.nextInt();
            System.out.print("Enter the elements of the first array: ");
            int arr1[]=new int[n1];
            int arr2[]=new int[n2];
            for (int i = 0; i < n1; i++) {
                arr1[i]=in.nextInt();
            }
            System.out.print("Enter the elements of second array: ");
            for (int i = 0; i < n2; i++) {
                arr2[i]=in.nextInt();
            }

            System.out.print("[");
            for (int i = 0; i < (arr1.length + arr2.length); i++) {
                if (i >= arr1.length) {
                    System.out.print(arr2[i - arr1.length]);
                    if (i != ((arr1.length + arr2.length) - 1)) {
                        System.out.print(", ");
                    }
                } else {
                    System.out.print(arr1[i] + ", ");
                }
            }
            System.out.print("]");
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        {
            // Print the average of an array ( input: [1, 2, 3]  -  output: 2 ).
            System.out.print("Enter the array's size: ");
            int n = in.nextInt();
            System.out.print("Enter the elements of array: ");
            int arr[] =new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=in.nextInt();
            }
           double sum=0,avv=0;
            for (int i = 0; i < n; i++) {
                sum+=arr[i];
            }
            avv=sum/arr.length;
            System.out.println(avv);

        }
         System.out.println("------------------------------------------------------------------------");
        {
            // Print the common elements between 2 arrays ( input: [1, 2, 3], [2, 3, 4]  -  output: 2  3 ).
            int c=0;
            System.out.print("Enter the size of first array: ");
            int n1 = in.nextInt();
            System.out.print("Enter the size of second array: ");
            int n2 = in.nextInt();
            System.out.print("Enter the elements of the first array: ");
            int arr1[] = new int[n1];
            int arr2[] = new int[n2];
            for (int i = 0; i < n1; i++) {
                arr1[i] = in.nextInt();
            }
            System.out.print("Enter the elements of second array: ");
            for (int i = 0; i < n2; i++) {
                arr2[i] = in.nextInt();
            }
            System.out.print(" the common elements is: [");
            for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
                if (arr1.length < arr2.length) {
                    for (int j = 0; j < Math.max(arr1.length, arr2.length); j++) {
                        if (arr1[i] == arr2[j]) {
                            System.out.print(arr1[i]);
                            c++;
                            if (i != (Math.min(arr1.length, arr2.length) - 1)) {
                                System.out.print(", ");
                            }
                        }
                    }
                } else {
                    for (int j = 0; j < Math.max(arr1.length, arr2.length); j++) {
                        if (arr2[i] == arr1[j]) {
                            System.out.print(arr2[i]);
                            c++;
                            if (i != (Math.min(arr1.length, arr2.length) - 1)) {
                                System.out.print(", ");
                            }
                        }
                    }
                }
            }
            if(c==0){
                System.out.print("NULL");
            }
            System.out.println("]");

        }
        System.out.println("------------------------------------------------------------------------");
        {
            System.out.print("Enter the size of array in first method: ");
            int n = in.nextInt();
            int nums[] = new int [n];
            System.out.print("Enter the elements: ");
            for (int i = 0; i < n; i++) {
                nums[i]=in.nextInt();
            }
            sum(nums);
        }
        System.out.println("------------------------------------------------------------------------");
        {
            System.out.print("Enter the number to find its Square: ");
            int n = in.nextInt();
            square(n);
        }
        System.out.println("------------------------------------------------------------------------");
        {
            System.out.print("Enter the array's size: ");
            int n = in.nextInt();
            int arr[] = new int[n];
            System.out.print("Enter the elements: " );
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            max(arr);

        }
        System.out.println();
        System.out.println("\"DONE :)\"");
    }

    // Write a Method to print the Sum of all the elements of a given Array
    public static void sum(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        System.out.println("The Sum = "+ sum);
    }


    // Write a Method to return the square of a number
    public static int square(int num) {
        System.out.println("the square of a number: "+num*num);
        return -1;
    }


    // Write a Method to find the Maximum Value of a given Array
    public static void max(int []arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        System.out.print("the Maximum Value of Array is : "+max);
    }

}