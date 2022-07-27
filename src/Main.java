import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size cua mang 1");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        for (int i=0;i < array1.length;i++){
            System.out.println("nhap phan tu vao trong mang 1 : tai vi tri i" + i);
            array1[i] = scanner.nextInt();
        }
        System.out.println("Nhap size2 cua mang 2");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i=0;i < array2.length;i++){
            System.out.println("nhap phan tu vao trong mang 2 : tai vi tri i m  m " + i);
            array2[i] = scanner.nextInt();
        }
        int length = array1.length + array2.length;
        int[] mangGop = new int[length];
        int j = 0;
        for (int element : array1){
            mangGop[j] = element;
            j++;
        }
        for (int element : array2){
            mangGop[j] = element;
            j++;
        }
        System.out.println(Arrays.toString(mangGop));
    }
}