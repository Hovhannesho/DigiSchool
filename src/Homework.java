//211
// public class Homework {
//
//    public static void main(String[] args) {
//        double[] numbers = {4, 8, 15, 21, 25};
//
//        double sum = 0;
//        for (double num : numbers) {
//            sum += num;
//        }
//
//        double mijin = sum / numbers.length;
//        System.out.println(mijin);
//    }
//}


//214
// public class Homework {
//    public static void main(String[] args) {
//        int[] array = {1, -2, 3, -4, 5};
//        double number = 0;
//        int count = 0;
//        for (int num : array) {
//            if (num > 0) {
//                number += num * num;
//                count++;
//            }
//        }
//        double number1;
//        if (count == 0) {
//            number1 = 0;
//        } else {
//            number1 = number / count;
//        }
//        System.out.println(number1);
//    }
//}


//215
// public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4,};
//        int aa = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
////            if (numbers[i] % 2 == 0) {
////                aa += numbers[i];
////            }
//        }
//        System.out.println(aa);
//    }
//}


//216
//public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4};
//        int aa = 1;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                aa *= numbers[i];
//            }
//        }
//        System.out.println(aa);
//    }
//}


//220
// public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, -2, 3, -4};
//        int drakan = 0;
//        int bacasakan = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 0) {
//                drakan++;
//            } else if (numbers[i] < 0) {
//                bacasakan++;
//            }
//        }
//
//
//        System.out.println("drakan: " + drakan);
//        System.out.println("bacasakan: " + bacasakan);
//    }
//}


//228
// public class Homework {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int aa = 3;
//
//        int sum = 1;
//        for (int i = 0; i < array.length; i++) {
//            if (i % aa == 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println(aa + sum);
//    }
//}


//232
// public class Homework {
//
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int aa = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                aa++;
//            }
//        }
//
//        System.out.println(aa);
//    }
//}


//233
// public class Homework {
//
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6};
//        int gumar = 0;
//        int artadryal = 1;
//
//        for (int i = 0; i < array.length; i++) {
//            int num = array[i];
//            if (num % 2 == 0) {
//                gumar += num;
//                artadryal *= num;
//            }
//        }
//
//        System.out.println("gumar: " + gumar);
//        System.out.println("artadryal: " + artadryal);
//    }
//}


//237
//public class Homework {
//
//    public static void main(String[] args) {
//        int[] array = {1, 0, 3, 0, 5, 0, 7, 0, 9, 0};
//        int aa = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 0) {
//                aa++;
//            }
//        }
//
//        System.out.println(aa);
//    }
//}


//238
// public class Homework {
//    public static void main(String[] args) {
//
//        int[] numbers = {1, 2, 3, 4, 5, 6};
//
//        int sum = 0;
//        int count = 0;
//
//
//        for (int i = 0; i < numbers.length; i++) {
//            int num = numbers[i];
//            if (num % 3 == 0) {
//                sum += num;
//                count++;
//            }
//        }
//        System.out.println(sum / count);
//
//    }
//}


//240
//public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
//        int aa = 0;
//
//        for (int i = 0; i < numbers.length; i++) {
//            int num = numbers[i];
//            if (num % 7 == 0) {
//                aa++;
//            }
//        }
//        System.out.println(aa);
//    }
//}

//241
//public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int aa = 5;
//
//        int aa1 = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            int num = numbers[i];
//            if (num % aa == 0) {
//                aa1 += num;
//            }
//        }
//        System.out.println(aa1);
//    }
//}

//242
//public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int aa = 5;
//
//        long aa1 = 1;
//        for (int i = 0; i < numbers.length; i++) {
//            int num = numbers[i];
//            if (num % aa == 0) {
//                aa1 *= num;
//            }
//        }
//        System.out.println(aa1);
//    }
//}

//243
//public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int aa = 5;
//
//        int aa1 = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            int num = numbers[i];
//            if (num % aa == 0) {
//                aa1++;
//            }
//        }
//        System.out.println(aa1);
//    }
//}


//251
//public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int max = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        System.out.println(max);
//    }
//}


//252
//public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int min = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
//        System.out.println(min);
//    }
//}


//253
//public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int max = numbers[0];
//        int min = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
//        System.out.println(max + min);
//    }
//}


//254
//public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int max = numbers[0];
//        int min = numbers[0];
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
//        System.out.println(max * min);
//    }
//}


//255
//public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int max = numbers[0];
//        int aa = 0;
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//                aa = i;
//            }
//        }
//        System.out.println(max + aa);
//    }
//}


//256
//public class Homework {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int min = numbers[0];
//        int aa = 0;
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] < min) {
//                min = numbers[i];
//                aa = i;
//            }
//        }
//        System.out.println(min + aa);
//    }
//}


//257
//public class Homework {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int max = array[0];
//        int number = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (max < array[i]) {
//                max = array[i];
//                number = i;
//            }
//        }
//        System.out.println(number);
//
//    }
//}


//258
//public class Homework {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int max = array[0];
//        int number = 0;
//        for(int i = 0;i<array.length;i++) {
//            if (max <= array[i]) {
//                max = array[i];
//                number = i;
//            }
//        }
//        System.out.println(number);
//    }
//}


//259
//public class Homework {
//    public static void main(String[] args) {
//
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int min = array[0];
//        int number = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (min > array[i]) {
//                min = array[i];
//                number = i;
//            }
//        }
//        System.out.println(number);
//
//    }
//}


//260
//public class Homework {
//    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int min = array[0];
//        int number = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (min >= array[i]) {
//                min = array[i];
//                number = i;
//            }
//        }
//        System.out.println(number);
//    }
//}


import room.Animal;

public class Homework {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.kg = 15;
        animal1.eat = "voskor";
        animal1.color = "black";
        animal1.name = "Dog";

        animal1.print();

        Animal animal2 = new Animal();
        animal2.kg = 10;
        animal2.eat = "rot";
        animal2.color = "black";
        animal2.name = "Cat";

        animal2.print();

    }
}