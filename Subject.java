package timetable;

public class Subject {
@Override
	public String toString() {
		return "Subject [SubName=" + SubName + ", Teacher=" + Teacher + ", Class=" + ClassName + "]";
	}
public String getSubName() {
		return SubName;
	}
	public void setSubName(String subName) {
		SubName = subName;
	}
	public String getTeacher() {
		return Teacher;
	}
	public void setTeacher(String teacher) {
		Teacher = teacher;
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String class1) {
		ClassName = class1;
	}
private String SubName;
private String Teacher;
private String ClassName;

}
