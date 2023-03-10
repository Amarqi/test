/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package quiz.anagram.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class AnagramTest {

    public static void main(String[] args) {
       String[] array = {"cook", "save", "taste", "aves", "vase", "state", "map"};
        anagram(array);
    }

    public static void anagram(String[] array) {
        List<String> answer = new ArrayList<>();
        ArrayList<Integer> duplicate = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (duplicate.contains(i)) {
                continue;
            }
            for (int j = 1; j < array.length; j++) {
                if (duplicate.contains(j)) {
                    continue;
                }
                String str1 = array[i];
                String str2 = array[j];
                char[] chr1 = array[i].toLowerCase().toCharArray();
                char[] chr2 = array[j].toLowerCase().toCharArray();
                Arrays.sort(chr1);
                Arrays.sort(chr2);
                if (count == 0) {
                    answer.add(str1);
                }
                count++;
                if (Arrays.equals(chr1, chr2)) {
                    answer.add(str2);
                    duplicate.add(i);
                    duplicate.add(j);
                } else {
                    continue;
                }
            }
            System.out.println(answer);
            answer.clear();
        }
    }
}
