package com.hospital.entity;

public class AB {
int Care_Taker;

public int getCare_Taker() {
	return Care_Taker;
}

public void setCare_Taker(int care_Taker) {
	Care_Taker = care_Taker;
}

public AB() {
	super();
	// TODO Auto-generated constructor stub
}

public AB(int care_Taker) {
	super();
	Care_Taker = care_Taker;
}

@Override
public String toString() {
	return "AB [Care_Taker=" + Care_Taker + "]";
}

}
