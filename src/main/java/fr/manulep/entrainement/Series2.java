package fr.manulep.entrainement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Series2 {
	
	private Series2() {
		 throw new IllegalStateException("Test class");
	}

	public static List<String> selectElementsFromListStartingWithA(List<String> elements) {
		List<String> newlist = new ArrayList<String>();
	
		for (int i = 0; i < elements.size(); i++){
			if (elements.get(i).charAt(0) == 'a'){
				newlist.add(elements.get(i));
			}
		}
		return newlist;
	}

	public static List<String> sortByLastLetter(List<String> names) {
		List<String> al = new ArrayList<String>();
		
		for (int i = 0; i < names.size(); i++) {
			al.add(names.get(i));
		}
		java.util.Collections.sort(al, (s1, s2) -> {
			String sb1 = s1.substring(s1.length() - 1);
			String sb2 = s2.substring(s2.length() - 1);
			return sb1.compareTo(sb2);
			});
		return al;
	}
	
	public static String exportWordsWithoutALetter(List<String> names, char letter) {
		String result = "";
		int flag = 0;

		if (names.size() > 0 && names.get(0).length() > 0) {
			for (int i = 0; i < names.size(); i++){
				if (names.get(i) != null) {
					flag = 0;
					for (int j = 0; j < names.get(i).length(); j++){
						if (names.get(i).toLowerCase().charAt(j) == letter) {
							flag = 1;
						}
						if (flag == 0 && j == names.get(i).length() - 1) {
							if (result == "") {
								result += names.get(i);
							}
							else {
								result += ", " + names.get(i);
							}
						}
					}
				}
			}
		}
		return result;
	}
	
	public static String getAllLetters(List<String> words) {
		List<Character> result = new ArrayList<Character>();
		String resString = "";
		boolean flag = false;

		for (int i = 0; i < words.size(); i++) {
			for (int j = 0; j < words.get(i).length(); j++) {
				for (int k = 0; k < result.size(); k++) {
					if (result.get(0) == words.get(i).charAt(j)){
						flag = true;
					}
				}
				if (flag == false) {
					result.add(words.get(i).charAt(j));
				}
			}
		}
		java.util.Collections.sort(result);
		for (int i = 0; i < result.size(); i++){
			resString += result.get(i);
		}
		return resString;
	}

	public static List<String> getElementsLowerThanNumber(List<String> elements, int maxi) {
		List<String> result = new ArrayList<String> ();

		for (int i = 0; i < elements.size(); i++) {
			if (Integer.parseInt(elements.get(i)) < maxi) {
				result.add(elements.get(i));
			}
		}
		java.util.Collections.sort(result);
		for (int i = 0; i < result.size() - 1; i++) {
			if (Integer.parseInt(result.get(i)) == Integer.parseInt(result.get(i + 1))) {
				result.remove(i);
			}
		}
		return result;
	}

	public static List<Integer> exportPeerElements(List<Integer> elements) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i< elements.size(); i++) {
			if (elements.get(i) % 2 == 0) {
				result.add(elements.get(i));
			}
		}
		return result;
	}

	public static List<Integer> exportSortPeerElements(List<Integer> elements) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i< elements.size(); i++) {
			if (elements.get(i) % 2 == 0) {
				result.add(elements.get(i));
			}
		}
		java.util.Collections.sort(result);
		for (int i = 0; i < result.size() - 1; i++) {
			if (result.get(i) == result.get(i + 1)) {
				result.remove(i);
			}
		}
		return result;
	}

	public static List<Integer> allElementsExceptFirstAndLast(List<Integer> elements) {
		List<Integer> result = new ArrayList<Integer>();

		if (elements.size() > 2) {
			for (int i = 1; i < elements.size() - 1; i++) {
				result.add(elements.get(i));
			}
		}
		return result;
	}
	
	public static List<Integer> reverseOrder(List<Integer> elements) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = elements.size() - 1; i >= 0; i--) {
			result.add(elements.get(i));
		}
		return result;
	}

	public static List<Integer> swapFirstandLastElement(List<Integer> elements) {
		List<Integer> result = new ArrayList<Integer>();
		int temp;
		if (elements.size() > 1) {
			temp = elements.get(0);
			for (int i = 0; i < elements.size(); i++) {
				if (i == 0) {
					result.add(elements.get(elements.size() - 1));
				}
				else if (i == elements.size() - 1) {
					result.add(temp);
				}
				else {
					result.add(elements.get(i));
				}
			}
		}
		else {
			return elements;
		}
		return result;
	}

	public static int numberOfPalindromeWord(String text) {
		String[] array = text.split(",");
		List<String> array_parsed = new ArrayList<String>();
		int flag = 0;
		int start = 0;
		int end = 0;
		int count = 0;
		int j = 0;

		for (String t : array) {
			flag = 0;
			start = 0;
			end = 0;
			if (t.length() > 1) {
				for (int i = 0; i < t.length(); i++) {
					if (t.charAt(i) == '\'' && flag == 0) {
						flag = 1;
						start = i;
					}
					else if (t.charAt(i) == '\'' && (i == t.length()- 1 || !Character.isLetter(t.charAt(i + 1))) && flag == 1) {
						flag = 0;
						end = i;
					}
				}
				array_parsed.add(t.substring(start + 1, end).toLowerCase().replaceAll(" ", "").replaceAll("\\?", ""));
				flag = 0;
				start = 0;
				end = 0;
			}
		}
		for (int i  = 0; i < array_parsed.size(); i++) {
			j = 0;
			if (array_parsed.get(i).length() < 2){
				count++;
			}
			else {
				while (array_parsed.get(i).charAt(j) == array_parsed.get(i).charAt(array_parsed.get(i).length() - 1 - j) && j <= array_parsed.get(i).length() / 2) {
					if (j == array_parsed.get(i).length() / 2){
						count++;
					}
					j++;
				}
			}
			
		}
		return count;
	}

	public static String longestWord(String text) {
		String[] array = text.split(" ");
		List<String> array_clean = new ArrayList<>();
		int	max = 0;
		int	mark = 0;

		for (String t : array){
			array_clean.add(t.replaceAll("[,.]", ""));
		}
		for (int i = 0; i < array_clean.size(); i++){
			if (array_clean.get(i).length() > max) {
				max = array_clean.get(i).length();
				mark = i;
			}
		}
		return array_clean.get(mark);
	}

	public static String getAllLetters(String[] array) {
		return null;
	}

	public static String titleize(String title) {
		String[] array = title.split(" ");
		List<String> array_title = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				array_title.add(array[i].substring(0, 1).toUpperCase() + array[i].substring(1));
			}
			else if (!array[i].equals("and") && !array[i].equals("the")){
				array_title.add(array[i].substring(0, 1).toUpperCase() + array[i].substring(1));
			}
			else if (array[i - 1].charAt(array[i - 1].length()-1) == '.'){
				array_title.add(array[i].substring(0, 1).toUpperCase() + array[i].substring(1));
			}
			else {
				array_title.add(array[i]);
			}
		}
		for (int i = 0; i < array_title.size(); i++) {
			sb.append(array_title.get(i));
			if (i != array_title.size() - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}

	public static List<String> findAnagrams(String name) {
		return null;
	}

	public static int roundUp(float number) {
		return (int)Math.round(number);
	}

	public static int findLastDayOfMonth(int month, int year) {
		boolean leap = false;

		System.out.println(year);
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = true;
				}
			}
			else {
				leap = true;
			}
		}
		if (month == 2 && leap) {
			return 29;
		}
		else if (month == 2 && !leap ){
			return 28;
		}
		else if (month == 4 || month == 6 || month == 9 || month ==11 ) {
			return 30;
		}
		else {
			return 31;
		}
	}

	public static int factorial(int number) {
		int result = 1;

		for (int i = number; i > 0; i--) {
			result *= i;
		}
		return result;
	}

	public static int convertToCelsius(int temperature) {
		double result = ((double)temperature - 32) * 5/9;
		result = Math.round(result);
		return (int)result;
	}

	public static boolean isPeerSum(final int... numbers) {
		int res = 0;
		for (int i = 0; i < numbers.length; i++){
			res += numbers[i];
		}
		if (res % 2 == 0 ) {
			return true;
		}
		return false;
	}

	public static boolean isRightTriangle(int side1, int side2, int side3) {
		if (side1 > side2 && side1 > side3) {
			if (Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2)) {
				return true;
			}
		}
		else if (side2 > side1 && side2 > side3) {
			if (Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2)) {
				return true;
			}
		}
		else if (side3 > side2 && side3 > side1) {
			if (Math.pow(side3, 2) == Math.pow(side2, 2) + Math.pow(side1, 2)) {
				return true;
			}
		}
		return false;
	}

	public static boolean isOrder(int... number) {
		List<Integer> check = new ArrayList<>();
		boolean order = true;
		boolean reverse = true;

		for (int n : number) {
			check.add(n);
		}
		java.util.Collections.sort(check);
		for (int i = 0; i < number.length; i++) {
			if (check.get(i) != number[i]) {
				order = false;
			}
		}
		java.util.Collections.reverse(check);
		for (int i = 0; i < number.length; i++) {
			if (check.get(i) != number[i]) {
				reverse = false;
			}
		}
		if (order || reverse) {
			return true;
		}
		return false;
	}

	public static Float intToFloat(int number) {
		return (float)number;
	}

	public static Integer floatToInt(float number) {
		return (int)number;
	}

	public static String dateToString(LocalDate date, String format) {
		return null;
	}

}
