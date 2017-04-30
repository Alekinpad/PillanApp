package cl.pillan.data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class InfraredSorter
{
	
static HashMap<String, String> map = new HashMap<String, String>();	
	
//0       ,1        ,2         ,3    ,4   ,5       ,6       ,7        ,8         ,9      ,10        ,11	
//latitude,longitude,bright_ti4,scan,track,acq_date,acq_time,satellite,confidence,version,bright_ti5,frp
	public static void main(String[] args) 
	{
		try
		{
		File file = new File("data/fuego_e_infrarojo.txt");
		FileReader fr = new FileReader(file);
		ArrayList<String> posxList = new ArrayList<String>();
		BufferedReader br = new BufferedReader(fr);
		for(String line = br.readLine(); line != null; line = br.readLine())
		{
			String chunks [] = line.split("\\,");
			if(map.containsKey(chunks[0]))
			{
				System.out.println("Collision on [" + chunks[0] + "]");
			}else
			{
				map.put(chunks[0], line);
				posxList.add(chunks[0]);
			}
		}
		 ArrayList
		
		
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		

	}

}
