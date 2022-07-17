package Hospital;
public class Management {
String Hospital_Name;
int Patient_ID;
int Checkup_Date;
String Doctor_Name;
String Care_Taker_Name;
String Patient_Name;
String Disease_Name;
String Medicine_Name;
public String getHospital_Name() {
	return Hospital_Name;
}
public void setHospital_Name(String hospital_Name) {
	Hospital_Name = hospital_Name;
}
public int getPatient_ID() {
	return Patient_ID;
}
public void setPatient_ID(int patient_ID) {
	Patient_ID = patient_ID;
}
public int getCheckup_Date() {
	return Checkup_Date;
}
public void setCheckup_Date(int checkup_Date) {
	Checkup_Date = checkup_Date;
}
public String getDoctor_Name() {
	return Doctor_Name;
}
public void setDoctor_Name(String doctor_Name) {
	Doctor_Name = doctor_Name;
}
public String getCare_Taker_Name() {
	return Care_Taker_Name;
}
public void setCare_Taker_Name(String care_Taker_Name) {
	Care_Taker_Name = care_Taker_Name;
}
public String getPatient_Name() {
	return Patient_Name;
}
public void setPatient_Name(String patient_Name) {
	Patient_Name = patient_Name;
}
public String getDisease_Name() {
	return Disease_Name;
}
public void setDisease_Name(String disease_Name) {
	Disease_Name = disease_Name;
}
public String getMedicine_Name() {
	return Medicine_Name;
}
public void setMedicine_Name(String medicine_Name) {
	Medicine_Name = medicine_Name;
}
public Management() {
	super();
	// TODO Auto-generated constructor stub
}
public Management(String hospital_Name, int patient_ID, int checkup_Date, String doctor_Name, String care_Taker_Name,
		String patient_Name, String disease_Name, String medicine_Name) {
	super();
	Hospital_Name = hospital_Name;
	Patient_ID = patient_ID;
	Checkup_Date = checkup_Date;
	Doctor_Name = doctor_Name;
	Care_Taker_Name = care_Taker_Name;
	Patient_Name = patient_Name;
	Disease_Name = disease_Name;
	Medicine_Name = medicine_Name;
}
@Override
public String toString() {
	return "Management [Hospital_Name=" + Hospital_Name + ", Patient_ID=" + Patient_ID + ", Checkup_Date="
			+ Checkup_Date + ", Doctor_Name=" + Doctor_Name + ", Care_Taker_Name=" + Care_Taker_Name + ", Patient_Name="
			+ Patient_Name + ", Disease_Name=" + Disease_Name + ", Medicine_Name=" + Medicine_Name + "]";
}

}
