package timetable;

public class Subject {
	private String subname;
	private String teacher;
	private String classname;
	public Subject(String subname, String teacher, String classname) {
		super();
		this.subname = subname;
		this.teacher = teacher;
		this.classname = classname;
	}
	@Override
	public String toString() {
		return "Subject [subname=" + subname + ", teacher=" + teacher + ", classname=" + classname + "]";
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}

}
