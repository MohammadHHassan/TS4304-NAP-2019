package day15.datastructures;

import java.util.ArrayList;

public class LearningArrayList
{
	public static void main(String[] args)
	{
		ArrayList<String> nameList = new ArrayList<String>();
		
		nameList.add("Mohammad");
		nameList.add("Haji Hassan");
		nameList.add("Haji Hashim");
		nameList.add("Abu Bakar");
		
		for(String name : nameList)
		{
			System.out.print(name + " ");
		}
		
		nameList.add(0, "Haji");
		nameList.add(2, "Bin");
		nameList.add(4, "Bin");
		nameList.remove(6);
		System.out.println();
		
		for(String name : nameList)
		{
			System.out.print(name + " ");
		}
		
		System.out.println();
		System.out.println(nameList.get(1));
		System.out.println(nameList.size());
	}
}