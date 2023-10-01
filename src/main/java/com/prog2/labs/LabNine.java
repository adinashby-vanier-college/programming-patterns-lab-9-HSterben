package com.prog2.labs;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author adinashby
 *
 */

public class LabNine {

	/**
	 * Write your test code below in the main (optional).
	 *
	 */
	public static void main(String[] args) {

	}

	/**
	 * Please refer to the README file for question(s) description
	 */
    
    public static List<List<String>> groupStrings(String[] strings) {

        List<List<String>> result = new ArrayList<>();

        HashMap<String, List<String>> answer = new HashMap<>();

        for (String str : strings) {
            String comparing = "";

            int distance = str.charAt(0) - 'a';

            for (int i = 0; i < str.length(); i++) {
                char letter = str.charAt(i);
                char offset = (char) (letter - distance);
                if (offset < 'a') {
                    offset = (char) (offset + 26);
                }
                comparing += offset;
            }

            if (answer.containsKey(comparing)) {
                answer.get(comparing).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                answer.put(comparing, list);
            }
        }

        result.addAll(answer.values());
        return result;
    }

}
