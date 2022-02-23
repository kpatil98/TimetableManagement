package timetable;

public class Timetable {
	private String subjectname;
	private String classname;
	private String teachername;
	@Override
	public String toString() {
		return "Timetable [subjectname=" + subjectname + ", classname=" + classname + ", teachername=" + teachername
				+ "]";
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}

}
