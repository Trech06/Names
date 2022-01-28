package home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ввод числа с проверкой
        int countWords;
        System.out.println("Введите число от 0 до 100");
        while(true) {
            Scanner scannerInt = new Scanner(System.in);
            try {
                countWords = scannerInt.nextInt();

                if (countWords <= 100 & countWords > 0) {
                    break;
                }
                else {
                    System.out.println("Вводите число от 0 до 100");
                }
            } catch (Exception e) {
                System.out.println("Вводите число от 0 до 100");
            }
        }

        //Ввод строк с проверкой
        System.out.println("Введите " + countWords + " английских слов(а) состоящих из 4 заглавных букв.");
        List<String> words = new ArrayList<>();
        for (int i=0; i < countWords; i++) {
            while (true) {
                Scanner scannerWords = new Scanner(System.in);
                String word = scannerWords.nextLine();
                int count = 0;
                char[] charsInInput = word.toCharArray();
                for (char charInInput: charsInInput) {
                    if (charInInput <= 'Z' & charInInput >= 'A') {
                        count++;
                    }
                }
                if (count == 4) {
                    words.add(word);
                    break;
                } else {
                    System.out.println("Введенное слово должно состоять из 4 английских заглавных букв!");
                }
            }
        }

        //Проверка выполнения главного условия задачи
        for (String word:words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if ((sorted.charAt(0)==sorted.charAt(1)) & sorted.charAt(2)==sorted.charAt(3) & sorted.charAt(1) != sorted.charAt(2)) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}
