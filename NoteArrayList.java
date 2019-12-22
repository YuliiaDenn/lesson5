package lesson1;

public class NoteArrayList {

	private String firstName;
	private String lastName;
	private String patronymicName;
	private Long phoneNumber;
	private int id;

	public NoteArrayList(int id, String firstName, String lastName, String patronymicName, Long phoneNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.patronymicName = patronymicName;
		this.phoneNumber = phoneNumber;
	}

	public NoteArrayList(String firstName, String lastName, String patronymicName, Long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.patronymicName = patronymicName;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPatronymicName() {
		return patronymicName;
	}

	public void setPatronymicName(String patronymicName) {
		this.patronymicName = patronymicName;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return getId() + " Note [Name = " + getFirstName() + ", Last name = " + getLastName() + ", Patronymic name = "
				+ getPatronymicName() + ", Phone number = " + getPhoneNumber() + "]";
	}

}
