//public class Lesson {
//    public static void main(String[] args) {
//        int[] array = {12, 54, 76, 89, 23};
//
//        for (int num : array) {
//            if (num >= 10 && num < 100) {
//                int hakarak = hakarakTiv(num);
//                System.out.print(hakarak + " ");
//            }
//        }
//    }
//    public static int hakarakTiv(int num) {
//        int arajin = num / 10;
//        int erkrord = num % 10;
//        return erkrord * 10 + arajin;
//    }
//}


//public class Lesson {
//    public static void main(String[] args) {
//        int[] numbers = new int[1000];
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i + 1;
//        }
//
//        for (int number : numbers) {
//            System.out.print(number + " ");
//        }
//    }
//}


//public class Lesson {
//    public static void main(String[] args) {
//        int[] array = {5, 6, 35, 90, 23};
//
//        System.out.println("Elements divisible by 5:");
//        for (int num : array) {
//            if (num % 5 == 0) {
//                System.out.println(num);
//            }
//        }
//    }
//}


//public class Lesson {
//    public static void main(String[] args) {
//        int[] numbers = {5, 12, 7, 9, 16, 22, 30, 35, 40};
//        int number1 = 0;
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                number1++;
//            }
//        }
//        System.out.println(number1);
//    }
//}


//import java.util.Scanner;
//
//public class Lesson {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        if (N <= 0 || N >= 21) {
//            System.out.println("ERROR");
//            return;
//        }
//        for (int i = 1; i <= 10; i++) {
//            int result = N * i;
//            System.out.println(N + " x " + i + " = " + result);
//        }
//        scanner.close();
//    }
//}














//public class Lesson {
//    public static void main(String[] args) {
//        int[][] numbers = {
//                {1, 2, 3, 2},
//                {4, 5, 6, 3},
//                {7, 8, 9, 4},
//                {7, 8, 9, 4}
//        };
//        numbers1(numbers);
//    }
//
//    public static void numbers1(int[][] matrix) {
//        int n = matrix.length;
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(matrix[i][n - 1 - i] + " ");
//        }
//    }
//}


//public class Lesson {
//    public static void main(String[] args) {
//        int[][] number = {
//                {1, 2, 3, 2},
//                {4, 5, 6, 3},
//                {7, 8, 9, 4},
//                {7, 8, 9, 4}};
//        number1(number);
//    }
//
//    public static void number1(int[][] number) {
//        int n = number.length;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (j >= i) {
//                    System.out.print(number[i][j] + " ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


public class Lesson {
    public static void main(String[] args) {
        int[][] number = {
                {1, 2, 3, 2},
                {4, 5, 6, 3},
                {7, 8, 9, 4},
                {7, 8, 9, 4}
        };

        number1(number);
    }

    public static void number1(int[][] number) {
        int n = number.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print(number[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}