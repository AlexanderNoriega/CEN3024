package Module3Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SpellChecker {

	public static void main(String[] args) throws FileNotFoundException {
		boolean doesMatch = false;
		ArrayList<String> testStatesList = new ArrayList<String>();
		ArrayList<String> dictionaryList = new ArrayList<String>();

		File testStatesFile = new File(
				"testStates.txt");
		File dictionaryFile = new File(
				"dictionary.txt");

		// String testStatesPath = testStatesFile.getAbsolutePath();
		// String dictionaryPath = dictionaryFile.getAbsolutePath();

		Scanner scan1 = new Scanner(testStatesFile);
		while (scan1.hasNext()) {
			testStatesList.add(scan1.next());
		}

		Scanner scan2 = new Scanner(dictionaryFile);
		while (scan2.hasNext()) {
			dictionaryList.add(scan2.next());
		}

		scan1.close();
		scan2.close();

		for (int i = 0; i < testStatesList.size(); i++) {
			for (int j = 0; j < testStatesList.size(); j++) {
				if (testStatesList.get(i).equals(dictionaryList.get(j))) {
					//System.out.print(testStatesList.get(i) + dictionaryList.get(j));
					doesMatch = true;
				}
			}
			if (doesMatch == false) {
				System.out.println(testStatesList.get(i) + ":Unknown Word");
			}
		}
	}
}
