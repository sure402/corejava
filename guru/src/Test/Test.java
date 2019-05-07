package Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Float> map = new HashMap<Integer, Float>();
		map.put(123456789, (float) 100);
		map.put(12345678, (float) 10);
		map.put(1234567, (float) 1);
		List<Integer> list = new ArrayList();
		for(int acno : map.keySet() ) 
            System.out.println("key: " + acno);
	Set<Integer> keySet = map.keySet();
	System.out.println("keySet"+ keySet);
	ArrayList<Integer> listOfKeys = new ArrayList<Integer>(keySet);
     
    System.out.println("ArrayList Of Keys :"+ listOfKeys);
     
    for (int key : listOfKeys) 
    {
        System.out.println(key);
     
    }
	}

}
