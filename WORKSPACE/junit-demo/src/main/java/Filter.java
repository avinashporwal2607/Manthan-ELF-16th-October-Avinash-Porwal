import java.util.ArrayList;
import java.util.List;

public class Filter {
	private DBUtil dbutil;
	public Filter(DBUtil dbUtil)
	{
		this.dbutil=dbUtil;
	}
	
	public List<String> myFilter()
	{
		List<String> newList=new ArrayList<String>();
		List<String> fromdb=dbutil.getNames();
		
		for(String name:fromdb)
		{
			if(name.startsWith("A"))
			{
				newList.add(name);
			}
		}
		return newList;
		
	}

}
