import java.util.Scanner;
import java.util.Random;

public class Task2 {
    public void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public double[] randomPerturbations(double[] vector) {
        double[] perturbate = new double[vector.length];
        System.arraycopy(vector, 0, perturbate, 0, vector.length);
        Random rnd = new Random();
        for (int i = perturbate.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            double temp = perturbate[index];
            perturbate[index] = perturbate[i];
            perturbate[i] = temp;
        }
        return perturbate;
    }

    public double[][] randomPerturbations(double[][] matrix) {
        double[][] perturbate = new double[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            perturbate[i] = randomPerturbations(matrix[i]);
        }
        return perturbate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the number of columns (M): ");
        int M = scanner.nextInt();

        Task2 contr = new Task2();

        double[][] matrix = new double[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = Math.round(Math.random() * 50);
            }
        }

        System.out.println("Matrix: ");
        contr.printMatrix(matrix);
        System.out.println("Perturbated Matrix: ");
        contr.printMatrix(contr.randomPerturbations(matrix));

        scanner.close(); // Закрываем Scanner после использования
    }
}
