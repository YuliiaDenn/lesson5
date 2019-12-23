package lesson1;

import java.util.ArrayList;
import java.util.Collections;

public class NoteArrayList2 {

	public static void main(String[] args) {

		ArrayList<String> note1 = new ArrayList<String>();

		note1.add("1");
		note1.add("Yuliia");
		note1.add("Denysenko");
		note1.add("52142");

		ArrayList<String> note2 = new ArrayList<String>();

		note2.add("2");
		note2.add("Yanna");
		note2.add("Rogovets");
		note2.add("52665");

		ArrayList<String> note3 = new ArrayList<String>();

		note2.add("2");
		note2.add("Yanna");
		note2.add("Rogovets");
		note2.add("52665");

		ArrayList<String> notes = new ArrayList<String>();
		notes.addAll(note1);
		notes.addAll(note2);
		notes.addAll(note3);

		System.out.println(notes.get(3));
		System.out.println(notes.indexOf("2"));
		System.out.println(notes.lastIndexOf("Yanna"));
		System.out.println(notes.iterator());
		System.out.println(notes.set(8, "3"));
		System.out.println(notes.subList(4, 8));
		System.out.println(notes.size());
		System.out.println(notes.contains("Rogovets"));
		System.out.println(notes.containsAll(note2));
		
		Collections.addAll(notes,"4", "Inna", "Bila", "52463");
		
		// methods: sort & of ????

		for (String a : notes) {
			if (a.length() - 1 % 4 == 0) {
				System.out.println();
			}
			System.out.print(a + " ");
		}

	}

}
