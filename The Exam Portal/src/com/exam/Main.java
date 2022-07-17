package com.exam;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		Random r  = new Random();
		int id = r.nextInt(10);
		Boolean  option = true;
		while (option) {
			System.err.println("************ Chose Your Option ************\n");
			System.out.println("Press 1:**** Registration Form ****\n");
			System.out.println("Press 2:**** Result View ****\n");
			System.out.println("Press 3:**** Enter Examination Hall ****\n");
			System.out.println("Press 4:**** Exit ****\n");
			
				int option2 =  Integer.parseInt(s.nextLine());
				switch (option2) {
			
			case 1:
				Registration rg = new Registration();
				System.err.println("Register Student Details ");
				rg.setID(id);
				System.out.println("Enter Your Name ");
				rg.setName(s.nextLine());
				System.out.println("Enter Your FathersName ");
				rg.setFathersName(s.nextLine());
				System.out.println("Enter Your Email ");
				rg.setEmail(s.nextLine());
				System.out.println("Enter Your Address ");
				rg.setAddress(s.nextLine());
				System.out.println("Enter Your City ");
				rg.setCity(s.nextLine());
				System.out.println("Enter Your State ");
				rg.setState(s.nextLine());
				System.out.println("Enter the Mobile  ");
				rg.setMobile(Long.parseLong(s.nextLine()));
				 				 
				 System.out.println("Your Details is Successfully");
				 System.out.println(rg);
				 break;
			
			case 2:
								
				System.out.println("Press 2:**** All Student Result View ****\n");              
				List<Result> re = new ArrayList<Result>();									
				re.add(new Result(101,"Ashu",1,"Hindi",100,40,50,700));
				re.add(new Result(201,"Vivek",2,"Math",100,40,80,600));
				re.add(new Result(301,"Anjali",3,"English",100,40,60,800));
				re.add(new Result(401,"Pankaj",4,"Physics",100,40,70,900));
				re.add(new Result(501,"Rudra",5,"Reasoning",100,40,80,1000));
				
				 System.err.println("Thank you ");
				for (Result result : re) {
					System.out.println(result);
				}
				 break;
				
			case 3:
				System.out.println("Press 3:**** Enter Examination Hall ****\n");
				System.out.println("========= Enter your class =========\n");

				int classes = Integer.parseInt(s.nextLine());
				if (classes == 1) {
					System.out.println("ID = 101,Name = Ashu ,Class = 1, Subject = Hindi, Full Marks = 100, Passing Marks = 40, Obtained Marks = 50, No. of Student = 700");
				}
					else if(classes == 2) {
						System.out.println("ID = 201,Name = Vivek ,Class = 2, Subject = Math, Full Marks = 100, Passing Marks = 40, Obtained Marks = 50, No. of Student = 700");
					}
					else if(classes == 3) {
						System.out.println("ID = 301,Name = Anjali ,Class = 3, Subject = English, Full Marks = 100, Passing Marks = 40, Obtained Marks = 50, No. of Student = 700");
					}
					else if(classes == 4) {
						System.out.println("ID = 401,Name = Pankaj ,Class = 4, Subject = Physics, Full Marks = 100, Passing Marks = 40, Obtained Marks = 50, No. of Student = 700");
					}
					else if(classes == 5) {
						System.out.println("ID = 501,Name = Rudra ,Class = 5, Subject = Reasoning, Full Marks = 100, Passing Marks = 40, Obtained Marks = 50, No. of Student = 700");
					}
					else {
						System.out.println("This class is Not Available");
					}
				System.err.println("The Class Details :"+ classes);
				break;
								
				case 4:
					System.out.println("Exit");
					option = true;
					break;
					
			    default:
				System.err.println("Invaild Option");
				break;
			}
		}
		       
	}
    }




//rt.setStudent_ID(101);
//rt.setStudent_Name("Prince");
//rt.setClass_Name(3);
//rt.setTotal_Marks(200);
//rt.setPassing_Marks(60);
//rt.setTotal_Student(500);
//rt.setStudent_Subject("Computer");
//rt.setStudent_Marks(140);