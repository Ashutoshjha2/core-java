import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Admin {

	public static void main(String[] args) throws IOException {

		System.err.println("***************Welcome To Bus Tickets Booking App**************\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 to Add Bus\n");
			System.out.println("Press 2 to Delete Bus\n");
			System.out.println("Press 3 to Display Bus\n");
			System.out.println("Press 4 to Update Bus\n");
			System.out.println("Press 5 to Exit ");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
//				add
				System.out.println("Enter user Bus No. :");
				int no = Integer.parseInt(br.readLine());

				System.out.println("Enter user Bus Destination :");
				String destination = br.readLine();

				System.out.println("Enter user Bus Fare :");
				String fare = br.readLine();

				System.out.println("Enter user Bus Seat :");
				String seat = br.readLine();

				Bus b = new Bus(no, destination, fare, seat);
				boolean answer = BusDao.insertBusToDB(b);
				if (answer) {
					System.out.println("Bus is added successfully");
				} else {
					System.out.println("Something went wrong......");
				}
				System.out.println(b);
			} 
			else if (c == 2) {
//				delete
				System.out.println("Enter Bus No Delete :");
				int userno = Integer.parseInt(br.readLine());
				boolean f = BusDao.deleteBus(userno);
				if (f) {
					System.out.println("Deleted ");
				} else {
					System.out.println("something wrong try again");
				}

			}
			else if (c == 3) {

//				display  
				BusDao.showAllBus();
			}
			else if (c == 4) {
//				update
			}
			else if (c == 5) {
//				exit
				break;
			} 
			else {
				System.out.println("Invalid");
			}

		}
		System.out.println("Thankyou for using My App .........");
	}

}
