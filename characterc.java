import java.util.*;
class CountCharacters
{
	public Map characterCount(char ch[])
	{
		int count =0;
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for(char c1:ch)
		{
			if(m.containsKey(c1))
			{
				count = m.get(c1);
				m.put(c1, count+1);
				
			}
			else
				m.put(c1, 1);
		}
		return m;
		
	}
}

 class CharHashMap {

	public static void main(String[] ags)
	{
		char []ch = new char[20];
		String str ="shubhamshubham";
		ch=str.toCharArray();
		CountCharacters t = new CountCharacters();
		System.out.println(t.characterCount(ch));
			
	}

}
