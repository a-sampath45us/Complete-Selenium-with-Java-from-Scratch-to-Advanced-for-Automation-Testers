import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;





public class JavaStreamsLambdaExps {

	
        //Count the number of names starting with Alphabet A in list
		//@Test
		public void regular()
		{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		int count = 0;
		for(int i=0;i<names.size();i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
		}
		
		//@Test
		//print all the names of ArrayList with length greater than 4
		public void streamFilter()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Don");
			names.add("Alekhya");
			names.add("Adam");
			names.add("Ram");
			//there is no life for intermediate op if there is no terminal op
			//terminal op will execute only if inter op(filter) returns true 
			//We can create stream
			Long c = names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
			
			//other way
			long d = Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.startsWith("A")).count();
			System.out.println(d);
			
			//print all the names of ArrayList with length greater than 4
			names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
			names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));//prints only the 1st output result 
		}

		//@Test
		//print names which have last letter as "a" and convert to Uppercase
		//use Maps if we need everything and put a condition
		//use filter if we need only some out of full things and put a condition
		public void streamMap() 
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Sam");
			names.add("Swe");
			names.add("Sash");
			names.add("Pri");
			names.add("Yas");
			names.add("Sims");
			//print names which have last letter as "a" and convert to Uppercase
			Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
			
			//print names which have first letter as "a" and convert to Uppercase and sorted
			List<String> names1 = Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rama"); //other way of implementing
			names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		    
			//Merging 2 different Lists and sorting them
		    Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		    newStream.sorted().forEach(s->System.out.println(s));
		    
		    //Here we are checking "Adam" is present in the list 
		    boolean flag = names1.stream().anyMatch(s->s.equalsIgnoreCase("Adam"));
		    Assert.assertTrue(flag);
		}
		
		@Test
		//To collect your results and convert it back to list
		//Take a list and do all the manipulations/modifications and convert into a new list and send it for further manipulations
		public void streamCollect()
		{
			List<String> ls = Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
			.collect(Collectors.toList());
			ls.stream().forEach(s->System.out.println(s));
			System.out.println(ls.get(0));
			//List<String> ls1 = ls.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
			//ls1.stream().forEach(s->System.out.println(s));
			
			//print unique number from this array and sort the array
			List<Integer> ln = Arrays.asList(3,2,2,7,5,1,9,7);
			ln.stream().distinct().sorted().forEach(s->System.out.println(s));
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


