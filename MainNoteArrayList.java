package lesson1;

import java.util.List;

public class MainNoteArrayList {

	public static void main(String[] args) {

		NoteBookArrayList notebook = new NoteBookArrayList();

		notebook.addNoteArrayList(new NoteArrayList("Yuliia", "Denysenko", "Olecsandrivna", 380976647613L));
		notebook.addNoteArrayList(new NoteArrayList("Yuliia", "Ivanenko", "Dmytrivna", 380975847663L));
		notebook.addNoteArrayList(new NoteArrayList("Inna", "Strim", "Olecsandrivna", 380976648564L));
		notebook.addNoteArrayList(new NoteArrayList("Olga", "Babych", "Ivanivna", 380975368972L));

		List<NoteArrayList> note = notebook.findNoteArrayList();
		System.out.println("all notes");
		showNotes(note);
		System.out.println();

		System.out.println("notes of phone number");
		System.out.println(notebook.findNoteOfPhoneNumber(380976647613L));
		System.out.println();

		System.out.println("notes of last name");
		System.out.println(notebook.findNoteOfLastName("Strim"));
		System.out.println();

		System.out.println("notes count");
		System.out.println(notebook.getCountOfNotes());
		System.out.println();

		System.out.println("notes after delete");
		notebook.deleteNotes(1);
		showNotes(note);
		System.out.println();

		System.out.println("notes after update");
		NoteArrayList note1 = note.get(0);
		note1.setLastName("Rogovets");
		showNotes(note);
		System.out.println();

	}

	public static void showNotes(List<NoteArrayList> notes) {
		for (NoteArrayList note : notes) {
			System.out.println(note);

		}
	}
}