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
		return new ArrayList<>();
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static String longestWord(String text) {
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}

	public static List<String> findAnagrams(String name) {
		return null;
	}

	public static int roundUp(float number) {
		return 0;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		return 0;
	}

	public static int convertToCelsius(int temperature) {
		return 0;
	}

	public static boolean isPeerSum(final int... numbers) {
		return false;
	}

	public static boolean isRightTriangle(int side1, int side2, int side3) {
		return false;
	}

	public static boolean isOrder(int... number) {
		return false;
	}

	public static Float intToFloat(int number) {
		return null;
	}

	public static Integer floatToInt(float number) {
		return null;
	}

	public static String dateToString(LocalDate date, String format) {
		return null;
	}

}
