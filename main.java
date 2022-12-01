// Пьяница

import java.util.ArrayList;
 
public class main {
 
    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 6, 8, 0};
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr1.add(a1[i]);
            arr2.add(a2[i]);
        }
 
        int count = 0;
        boolean res = false;
 
        for (int i = 0; i < 10000; i++) {
            count++;
            if (arr1.get(0) > arr2.get(0) || ((arr1.get(0) == 0) && (arr2.get(0) == 9))) {
                arr1.add(arr1.get(0));
                arr1.add(arr2.get(0));
            } else if (arr1.get(0) < arr2.get(0) || ((arr1.get(0) == 9) && (arr2.get(0) == 0))) {
                arr2.add(arr2.get(0));
                arr2.add(arr1.get(0));
            }
                arr1.remove(0);
                arr2.remove(0);
                
            if (arr1.size() == 0) {
                System.out.println("Second " + count);
                res = true;
                break;
            } else if (arr2.size() == 0) {
                System.out.println("First " + count);
                res = true;
                break;
            }
        }
        if (!res) System.out.println("Botva!");
    }
}




// Задача про шарики

/* import java.util.Scanner;
 
public class main {
    public static void main(String[] argv) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int count = 0;
        int arr[] = new int[a];
        int cur_pos = 0, perv = -2;
        for(int i=0; i<a;++i) {
            arr[i] = in.nextInt();
        }
        
        for(int l=0; l<2;++l) {
        for(int i=0; i<a;++i) {
            if (arr[i] == -1) continue;
            if (arr[i] == perv) {
                cur_pos++;
            } else {
                if(cur_pos >= 3) {
                    for(int j = i-1;  j>0 || arr[j]== -1|| arr[j] == perv;j--) {
                        arr[j] = -1;
                        count++;
                    }
                    cur_pos = 0;
                    perv = -2;
                }
 
            }
            perv = arr[i];
        }
        }
        System.out.println(count);
        for(int i=0; i<a;++i) {
            System.out.print(arr[i]);           
        }
        in.close();
    
    }
} */