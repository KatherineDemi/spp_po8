import java.util.Random;

public class Task2 {
    
    public static void main(String[] args) {
        // Пример использования метода randomPerturbations
        // Создаем матрицу 3x3
        double[][] matrix = {
            {1.0, 2.0, 3.0},
            {4.0, 5.0, 6.0},
            {7.0, 8.0, 9.0}
        };
        
        // Выводим исходную матрицу
        System.out.println("Исходная матрица:");
        printMatrix(matrix);
        
        // Вызываем метод randomPerturbations для случайного изменения матрицы
        randomPerturbations(matrix);
        
        // Выводим измененную матрицу
        System.out.println("\nМатрица после случайных изменений:");
        printMatrix(matrix);
    }
    
    // Метод для случайного переставления элементов матрицы
    public static void randomPerturbations(double[][] matrix) {
        Random random = new Random();
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Перебираем элементы матрицы и случайно меняем их местами
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int randRow = random.nextInt(rows);
                int randCol = random.nextInt(cols);
                
                // Меняем местами элементы matrix[i][j] и matrix[randRow][randCol]
                double temp = matrix[i][j];
                matrix[i][j] = matrix[randRow][randCol];
                matrix[randRow][randCol] = temp;
            }
        }
    }
    
    // Метод для вывода матрицы в консоль
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
