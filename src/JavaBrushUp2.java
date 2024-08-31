import java.util.ArrayList;

public class JavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");
		
		//System.out.println(a.get(3));
		for (int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("*****");
		for (String val:a)
		{
			System.out.println(val);
		}
		
		
		
		
		
	}

}
