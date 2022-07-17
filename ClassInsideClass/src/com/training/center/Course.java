package com.training.center;

public class Course {
int ID;
String Java;
String Python;
String PHP;
String Kotlin;
String JavaScript;
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getJava() {
	return Java;
}
public void setJava(String java) {
	Java = java;
}
public String getPython() {
	return Python;
}
public void setPython(String python) {
	Python = python;
}
public String getPHP() {
	return PHP;
}
public void setPHP(String pHP) {
	PHP = pHP;
}
public String getKotlin() {
	return Kotlin;
}
public void setKotlin(String kotlin) {
	Kotlin = kotlin;
}
public String getJavaScript() {
	return JavaScript;
}
public void setJavaScript(String javaScript) {
	JavaScript = javaScript;
}
public Course(int iD, String java, String python, String pHP, String kotlin, String javaScript) {
	super();
	ID = iD;
	Java = java;
	Python = python;
	PHP = pHP;
	Kotlin = kotlin;
	JavaScript = javaScript;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Course [ID=" + ID + ", Java=" + Java + ", Python=" + Python + ", PHP=" + PHP + ", Kotlin=" + Kotlin
			+ ", JavaScript=" + JavaScript + "]";
}

}
