package sub03;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSetTest {

	public static void main(String[] args) {
		
		// Set 생성
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(3);
		set.add(5);
		
		// Set 원소 갯수
		System.out.println("set 원소 갯수 : "+set.size());
	
		// Set 원소 출력
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next()+", ");
		}
	}	
}
