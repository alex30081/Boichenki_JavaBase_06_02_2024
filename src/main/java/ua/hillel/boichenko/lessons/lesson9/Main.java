package main.java.ua.hillel.boichenko.lessons.lesson9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[][] array = new int[3][5];
//        array[0][0] = 55;
//        System.out.println(Arrays.deepToString(array));
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = (int) (Math.random() * 11);//заповненя значень масива рандомними значеннями
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//        int [][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                System.out.print(array1[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        int array [][] = { //зтвореня и друк зубчатого масива з видомими значеннями
//                {1},
//                {2, 9, 4, 0, 45, 32},
//                {},
//                {45, 90, 89, 1,},
//                {4, 6,},
//                {8, 4, 1,}
//        };
//        System.out.println("row count =" + array.length);
//        System.out.println(array[0].length);
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);
//        System.out.println(array[3].length);
//        System.out.println(array[4].length);
//        System.out.println(array[5].length);
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//
//        }
//        int [][] array = new int[5][5];
        // version 1;
//        int counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == counter && j == counter) {
//                    array[i][j] = 1;
//                }
//            }
//            counter++;
//        }
        //version 2;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i == j) {
//                    array[i][j] = 1;
//                }
//            }
//        }
        // version 3
//        for (int i = 0; i < array.length; i++) {
//            array[i][i] = 1;
//
//        }
        // versin 1; заповненя масива наоборот по диагонале
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (i + j == array.length - 1){
//                    array[i][j] = 1;
//                }
//
//            }
//
//        }
        //version 2;
//        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
//            array[i][j] = 1;
//
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//
//            }
//            System.out.println();
//
//        }
        //version 3;
//        for (int i = 0; i < array.length; i++) {
//            array[i][array.length - 1 - i] = 1;
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//
//            }
//            System.out.println();
//
//        }
//        char ches [][] = new char[8][8];
//        for (int i = 0; i < ches.length ; i++) {
//            for (int j = 0; j < ches[i].length; j++) {
//                if ((i + j) % 2 == 0) {
//                    ches[i][j] = 'B';
//                }
//                else {
//                    ches[i][j] = 'W';
//                }
//
//            }
//
//        }
//        for (int i = 0; i < ches.length; i++) {
//            for (int j = 0; j < ches[i].length; j++) {
//                System.out.print(ches[i][j] + "\t");
//
//            }
//            System.out.println();
//
//        }
        // заповнення значень в комирках масива за допомогою тернарного оператора
//        for (int i = 0; i < ches.length; i++) {
//            for (int j = 0; j < ches[i].length; j++) {
//                ches[i][j] = ((i + j) % 2 == 0) ? 'B':'w';
//
//            }
//
//        }
//        for (int i = 0; i < ches.length; i++) {
//            for (int j = 0; j < ches[i].length; j++) {
//                System.out.print(ches[i][j] + "\t");
//
//            }
//            System.out.println();
//
//        }
//        int [][][] array  = new int [3][2][4];
//        System.out.println(array.length);//друк килькости пллощин в масиви
//        System.out.println(array[0].length);// друк килькости рядкив в конкретний площини
//        System.out.println(array[1].length);
//        System.out.println(array[2].length);
//        System.out.println(array[1][0].length);// друк килькости стовбцив в конкретний площини и в конкретному рядку
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array [i][j].length; k++) {
//                    array[i][j][k] = (int) (Math.random() * 101);
//
//                }
//
//            }
//
//        }
//        System.out.println(Arrays.deepToString(array));
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//
//                }
//                System.out.println();
//
//            }
//            System.out.println();
//            System.out.println();
//
//        }// вносим дани в новый трехвымирний масив
//        int [][][] array = {
//                {
//                        {1, 3, 23, 4},
//                        {2, 1},
//                        {1},
//                        {2, 3, 43, 89, 90, 123, 43},
//                        {1, 4, 67}
//                },
//                {
//                        {2, 3},
//                        {45},
//                        {34, 56, 7, -34, 67},
//                        {45, 90, -34, -76, -56, 34, 124, 567, 90}
//                },
//                {
//                        {35, 89, 9, 0, -1},
//                        {345, 67, 2, 8},
//                        {4, 6, 89, 123, 4, 7, 9, 0, 12, 18, 21}
//                }
//        };
//        System.out.println(Arrays.deepToString(array));//друк трехвымирного зубчатого масива
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                for (int k = 0; k < array[i][j].length; k++) {
//                    System.out.print(array[i][j][k] + "\t");
//                }
//                System.out.println();
//
//            }
//            System.out.println();
//            System.out.println();
//
//        }
        int [][][] array = {
                {
                        {1, 23, 45, 67},
                        {4, 6, 89, 7}
                },
                {
                        {3, 5, 9, 0},
                        {12, 4, 8, 12},
                },
                {
                        {5, 0, 12, 18},
                        {3, 16, 19, 21}
                }
        };// робота з конкретною площиною даного трех вимирного масивваж
        int[][] demo = array[0];// array [0] це мы працюэм з нашим трехвымирным масивом, з нульовою площиною индексом
        for (int i = 0; i < demo.length; i++) {
            for (int j = 0; j < demo[i].length; j++) {
                System.out.print(demo[i][j] + "\t");

            }
            System.out.println();

        }
//        // робота з конкретным рядком даного масыва
//        int [] demo0 = array [0][0];
//        System.out.println(Arrays.toString(demo0));
//        System.out.println();
//        System.out.println();
//        // робота з конкретною комиркою даного масива
//        int demo1 = array[0][0][1];
//        System.out.println(demo1);
    }

}
