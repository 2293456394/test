import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestJava {
	
	public static void main(String[] args) {
		

        
        
        List<String>list1=new ArrayList<String>();
        list1.add("GSLD");
        list1.add("GSBGSFG");
        list1.add("GSBGSZG");
        list1.add("GSBGSCG");
        list1.add("GSCG");
        
        
        List<String>list2=new ArrayList<String>();
        list2.add("GSLD");
        list2.add("b");
        
       list1.retainAll(list2);
        
        
        System.out.println(list1);
        
     

	}

}
