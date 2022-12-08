import java.util.ArrayList;
import java.util.stream.Collectors;

public class lab13 
{
	public ArrayList<Integer> values = new ArrayList<>(); 
	public void readData(String filename)
	{
		
		try {
			String inn;
		java.io.BufferedReader input = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(filename)));
		while( (inn = input.readLine()) != null )
		{
			values.add(Integer.valueOf(inn.trim()));
		}
		input.close();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
	public long getTotalCount()
	{
		return values.stream().count();
	}
	public long getOddCount()
	{
		return values.stream().filter(i->i%2==1).count();
	}
	public long getEvenCount()
	{
		return values.stream().filter(i -> i % 2 == 0).count();
	}
	public long getDistinctGreaterThanFiveCount()
	{
		return values.stream().filter(i -> i > 5).distinct().count();
	}
	public Integer[] getResult1()
	{
		return values.stream().filter(i -> i % 2 == 0).filter(i -> i > 5).filter(i-> i < 50).sorted().toArray(Integer[]::new);
	}
	public Integer[] getResult2()
	{
		return values.stream().map(i -> i * i * 3).limit(50).toArray(Integer[]::new);
	}
	public Integer[] getResult3()
	{
		return values.stream().filter(i->i%2==1).map(i -> i * 2).sorted().skip(20).distinct().toArray(Integer[]::new);
	}

}

