package Work;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;
public class StreamMain1 {
public static void main(String[] args) {
//	create a list & filter all even no. from list
	
//	List<Integer>list1 = List.of(2, 4, 5, 8, 50, 60);
	List<Integer>list2 = new ArrayList<>();
	list2.add(12);
	list2.add(34);
	list2.add(23);
	list2.add(78);
    List<Integer> list3 = Arrays.asList(23, 567, 12, 677, 24);
////    Without steram
//    
//    List<Integer> listEven = new ArrayList<>();
//    for(Integer i : list1) {
//	if(i % 2 == 0) {
//	listEven.add(i);
//}
//}
	System.out.println(list2);
//	System.out.println(listEven);

//    Stream<Integer>stream = list1.stream();
	List<Integer>newList = list2.stream().filter(i-> i % 2 ==0).collect(Collectors.toList());
	System.out.println(newList);

	List<Integer>newList1 = list2.stream().filter(i-> i >10).collect(Collectors.toList());
	System.out.println(newList1);
	
}
}
