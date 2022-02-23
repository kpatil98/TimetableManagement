package timetable;

public class Student {
@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Address=" + Address + ", Contact=" + Contact + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
	}
private int id;
private String Name;
private String Address;
private long Contact;
}

