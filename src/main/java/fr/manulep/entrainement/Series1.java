package fr.manulep.entrainement;

public class Series1 {
	
	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) {
		//1
		if (name == null || name == "") {
			return("Hello World");
		} else {
			return("Hello " + name);
		}
	}
	

	public static String[] removeNullElements(String[] array) {
		//2
		int compt = 0;
		int j = 0;
		for (int i = 0; i < array.length; i++){
			if (array[i] != null) {
				compt++;
			}
		}
		String[] arrayClean = new String[compt];
		for (int i = 0; i < array.length; i++){
			if (array[i] != null){
				arrayClean[j] = array[i];
				j++;
			}
		}
		return arrayClean;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		//3
		int[] newArray;
		if (array.length > 0) {
			newArray = new int[array.length + 1];
		}
		else{
			newArray = new int[1];
		}
		for (int i = 0; i < newArray.length; i++){
			if (i == 0) {
				newArray[i] = element;
			}
			else{
				newArray[i] = array[i - 1];
			}
		}
		return newArray;
	}
	
	public static int[] allElementsExceptFirstThree(int[] array) {
		//4
		int[] newArray = {};
		if (array.length < 3){
			return newArray;
		}
		else{
			newArray = new int[array.length - 3];
			for (int i = 3; i < array.length; i++){
				newArray[i - 3] = array[i];
			}
		}
		return newArray;
	}
	
	public static String getFirstHalf(String word) {
		//5
		String newWord;
		if (word.length()%2 != 0){
			newWord = word.substring(0,word.length()/2 + 1);
		}
		else {
			newWord = word.substring(0,word.length()/2);
		}
		return newWord;
	}
	
	public static String[] selectElementsStartingWithA(String[] array) {
		//6
	String[] newArray = {};
	int compt = 0;
	int j = 0;
	for (int i = 0; i < array.length; i++){
		if (array[i].charAt(0) == 'a'){
			compt++;
		}
	}
	if (compt > 0) {
		newArray = new String[compt];
		for(int i = 0; i < array.length; i++){
			if (array[i].charAt(0) == 'a'){
				newArray[j] = array[i];
				j++;
			}
		}
	}
		return newArray;
	}
	
	public static String[] selectElementsStartingWithVowel(String[]array) {
		//7
		String[] newArray = {};
	int compt = 0;
	int j = 0;
	for (int i = 0; i < array.length; i++){
		if (array[i] != null){
			switch (array[i].charAt(0)){
				case 'a':
					compt++;
				break;
				case 'e':
					compt++;
				break;
				case 'i':
					compt++;
				break;
				case 'o':
					compt++;
				break;
				case 'u':
					compt++;
				break;
				case 'y':
					compt++;
				break;
			}
		}
	}
	if (compt > 0) {
		newArray = new String[compt];
		for(int i = 0; i < array.length; i++){
			if (array[i] != null){
				switch (array[i].charAt(0)){
					case 'a':
						newArray[j] = array[i];
						j++;
					break;
					case 'e':
						newArray[j] = array[i];
						j++;
					break;
					case 'i':
						newArray[j] = array[i];
						j++;
					break;
					case 'o':
						newArray[j] = array[i];
						j++;
					break;
					case 'u':
						newArray[j] = array[i];
						j++;
					break;
					case 'y':
						newArray[j] = array[i];
						j++;
					break;
				}
			}
		}
	}
	return newArray;
}
	public static String[] reverseOrderInArray(String[]array) {
		//8
		String[] newArray = new String[array.length];
		int j = array.length - 1;
		for (int i = 0; i < array.length; i++){
			newArray[j] = array[i];
			j--;
		}
		return newArray;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		//9
		int[] newArray = new int[array.length + 1];
		int j = 0;
		for (int i = 0; i < newArray.length; i++){
			if (i == array.length / 2){
				newArray[i] = element;
			}
			else {
				newArray[i] = array[j];
				j++;
			}
		}
		return newArray;
	}

	public static String shortestWord(String text) {
		//10
		String[] shortest = text.split(" ");
		String tmp = shortest[0];
		for(int i = 0; i < shortest.length; i++){
			if (tmp.length() > shortest[i].length()){
				tmp = shortest[i];
			}
		}
		return tmp;
	}

	public static String removeCapitals(String text) {
		//11
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		//12
		return -1;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		//13
		return -2;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		//14
		return -1;
	}

	public static float makeNegative(float number) {
		//15
		return 0;
	}

	public static boolean checkForSpecialCharacters(String string) {
		//16
		return false;
	}

	public static boolean checkIfStringStartsWithConsonant( String word ) {
		//17
		return false;
	}

	public static String getDomainName(String email) {
		//18
		return null;
	}

	public static int[] letterPosition(String name) {
		//19
		return null;
	}

	public static boolean isPeer(int number) {
		//20
		return false;
	}


}
