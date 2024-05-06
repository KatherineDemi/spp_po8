import java.util.Scanner; 


public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 2, 3, 5, 5, 8};
        int n = array.length;
        
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
        
        for (int i = 0, m = 0; i != n; i++, n = m) {
            for (int j = m = i + 1; j != n; j++) {
                if (array[j] != array[i]) {
                    if (m != j)
                        array[m] = array[j];
                    m++;
                }
            }
        }
        
        if (n != array.length) {
            int[] new_array = new int[n];
            for (int i = 0; i < n; i++)
                new_array[i] = array[i];
            array = new_array;
        }
        
        for (int elements : array) {
            System.out.print(elements + " ");
        }
    }
}
