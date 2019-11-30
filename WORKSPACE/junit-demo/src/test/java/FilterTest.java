


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;//it should be static here

public class FilterTest {
	@Test
	public void testMyFilter()
	{
		DBUtil db=mock(DBUtil.class);
		Filter F=new Filter(db);
		when(db.getNames()).thenReturn(Arrays.asList("Amith","Priya","Bhanu"));
			List<String> myList=F.myFilter();
			assertEquals(1, myList.size());
		
	}

}
