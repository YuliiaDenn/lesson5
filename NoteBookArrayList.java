package lesson1;

import java.util.ArrayList;

import java.util.List;

public class NoteBookArrayList {

	private final List<NoteArrayList> contacts = new ArrayList<NoteArrayList>();
	public static int ID_NUMBER;

	public void addNoteArrayList(NoteArrayList contact) {
		contact.setId(ID_NUMBER++);
		contacts.add(contact);

	}

	public NoteArrayList getNoteArrayList(Long id) {
		for (NoteArrayList contact : contacts) {
			if (contact.getId() == id) {
				return contact;
			}
		}
		return null;
	}

	public List<NoteArrayList> findNoteArrayList() {

		return contacts;

	}

	public NoteArrayList findNoteOfPhoneNumber(long number) {

		for (NoteArrayList contact : contacts) {
			if (contact.getPhoneNumber() == number)

				return contact;
		}
		return null;
	}

	public NoteArrayList findNoteOfLastName(String lastName) {

		for (NoteArrayList contact : contacts) {
			if (contact.getLastName().equals(lastName))

				return contact;

		}
		return null;

	}

	public int getCountOfNotes() {
		return contacts.size();
	}

	public void deleteNotes(int id) {

		contacts.remove(id);

	}

}
