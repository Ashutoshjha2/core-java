package com.training.center;

public class Registration {
int ID;
String Name;
String Fathers_Name;
String College_Name;
String Course_Name;
int Course_Duration;
String DOB;
public void setDOB(String dOB) {
	DOB = dOB;
}
int Course_Fee;
Course Course;

public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getFathers_Name() {
	return Fathers_Name;
}
public void setFathers_Name(String fathers_Name) {
	Fathers_Name = fathers_Name;
}
public String getCollege_Name() {
	return College_Name;
}
public void setCollege_Name(String college_Name) {
	College_Name = college_Name;
}
public String getCourse_Name() {
	return Course_Name;
}
public void setCourse_Name(String course_Name) {
	Course_Name = course_Name;
}
public int getCourse_Duration() {
	return Course_Duration;
}
public void setCourse_Duration(int course_Duration) {
	Course_Duration = course_Duration;
}

public int getCourse_Fee() {
	return Course_Fee;
}
public void setCourse_Fee(int course_Fee) {
	Course_Fee = course_Fee;
}
public Course getCourse() {
	return Course;
}
public void setCourse(Course course) {
	Course = course;
}
public Registration() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Registration [ID=" + ID + ", Name=" + Name + ", Fathers_Name=" + Fathers_Name + ", College_Name="
			+ College_Name + ", Course_Name=" + Course_Name + ", Course_Duration=" + Course_Duration + ", DOB=" + DOB
			+ ", Course_Fee=" + Course_Fee + ", Course=" + Course + "]";
}


}