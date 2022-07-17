package com.student;

import java.util.ArrayList;
import java.util.List;

public class Controller {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		List<Student> st = new ArrayList<Student>();
//	    s.setId(12); 
//	    s.setName("chitrakoot");
		
		///
		st.add(new Student(1,"vivek","chitrakoot","v@gmail.com"));
		st.add(new Student(2,"ravi","chitrakoot","v@gmail.com"));
		st.add(new Student(3,"ashutosh","chitrakoot","v@gmail.com"));
		st.add(new Student(4,"vinay","chitrakoot","v@gmail.com"));
//		 st.add(s);
//		 st.add(1, s);
		//Student student2 = st.get(1);
		//System.out.println("Index "+student2);
		System.out.println(st);
//		System.err.println("after index changing");
		
//		  for (Student student : st) {
//			  System.out.println(student);
			  }
		 
	}

//}
