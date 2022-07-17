package Student;
public class Course
{
	int id;
int Course_Fee;
String Course_name;
String Teacher_name ;
int Course_Duration;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCourse_Fee() {
	return Course_Fee;
}
public void setCourse_Fee(int course_Fee) {
	Course_Fee = course_Fee;
}
public String getCourse_name() {
	return Course_name;
}
public void setCourse_name(String course_name) {
	Course_name = course_name;
}
public String getTeacher_name() {
	return Teacher_name;
}
public void setTeacher_name(String teacher_name) {
	Teacher_name = teacher_name;
}
public int getCourse_Duration() {
	return Course_Duration;
}
public void setCourse_Duration(int course_Duration) {
	Course_Duration = course_Duration;
}
@Override
public String toString() {
	return "Course [id=" + id + ", Course_Fee=" + Course_Fee + ", Course_name=" + Course_name + ", Teacher_name="
			+ Teacher_name + ", Course_Duration=" + Course_Duration + "]";
}

}