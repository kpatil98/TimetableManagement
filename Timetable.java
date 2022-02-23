package timetable;

public class Timetable {
@Override
	public String toString() {
		return "Timetable [Subject=" + SubjectName + ", ClassName=" + Classname + ", Teacher=" + TeacherName + "]";
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subject) {
		SubjectName = subject;
	}
	public String getClassname() {
		return Classname;
	}
	public void setClassname(String classname) {
		Classname = classname;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacher(String teacher) {
		TeacherName = teacher;
	}
private String SubjectName;
private String Classname;
private String TeacherName;
}