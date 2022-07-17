package NewFeatures;
import java.util.function.*;
public class Test {

	public static void main(String[] args)
	{
		Function<Integer,Integer> f=i->i*i;
		System.out.println("The Square of 4:"+f.apply(4));
		System.out.println("The Square of 5:"+f.apply(5));

	}

}
