package Alert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {1,2,8,6};
int arr2[]= {1,8,7,6};

List<Integer> list1=new ArrayList<Integer>();
List<Integer> list2=new ArrayList<Integer>();
for(int i:arr1)
{
	list1.add(i);
}
for(int i:arr2)
{
	list2.add(i);
}
list1.retainAll(list2);
System.out.println(list1);

	}

}
