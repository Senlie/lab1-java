/**
 * Лабораторна робота №1
 * Тема: Основні типи та оператори мови програмування Java
 *
 * Номер залікової книжки: 5103
 *
 * Варіант:
 *   C2 = 5103 % 2 = 1  → O1: -
 *   C3 = 5103 % 3 = 0  → C  = 0
 *   C5 = 5103 % 5 = 3  → O2: +
 *   C7 = 5103 % 7 = 5  → тип індексів i, j: float
 *
 * Формула:
 *   S = sum(i=a..n) sum(j=b..m) [ (i + j) - C ]
 *       де C = 0, тип i та j — float
 */
public class Lab1 {

    public static void main(String[] args) {

        float a = 1.0f;   // нижня межа i
        float n = 5.0f;   // верхня межа i
        float b = 1.0f;   // нижня межа j
        float m = 5.0f;   // верхня межа j

        // Константа C (C3 = 5103 % 3 = 0) 
        final int C = 0;

        double S = 0.0;

        try {

            if (a > n) {
                throw new IllegalArgumentException(
                    "Нижня межа i (a=" + a + ") більша за верхню (n=" + n + ")"
                );
            }
            if (b > m) {
                throw new IllegalArgumentException(
                    "Нижня межа j (b=" + b + ") більша за верхню (m=" + m + ")"
                );
            }

            for (float i = a; i <= n; i++) {
                for (float j = b; j <= m; j++) {

                    double inner;

                    // O2: + (C5 = 3)
                    inner = i + j;

                    // O1: - (C2 = 1)
                    double term = inner - C;

                    S += term;
                }
            }

            System.out.println("=== Лабораторна робота №1 ===");
            System.out.println("Номер залікової книжки : 5103");
            System.out.println("C2=" + (5103 % 2) + " → O1: -");
            System.out.println("C3=" + (5103 % 3) + " → C = 0");
            System.out.println("C5=" + (5103 % 5) + " → O2: +");
            System.out.println("C7=" + (5103 % 7) + " → тип i,j: float");
            System.out.println("-----------------------------");
            System.out.printf("a=%.0f, n=%.0f, b=%.0f, m=%.0f%n", a, n, b, m);
            System.out.printf("S = %.6f%n", S);

        } catch (IllegalArgumentException e) {
            System.err.println("Помилка вхідних даних: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Арифметична помилка: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Непередбачена помилка: " + e.getMessage());
        }
    }
}
