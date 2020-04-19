
import java.util.*;

public class SortStringLengthwise implements Comparator<String>{
	@Override
	public int compare(String s1,String s2) {
		return s1.length()-s2.length();
	}
	public static void main(String args[]) {
		List<String> al=new ArrayList<String>();
		al.add("qwerty");
		al.add("acdefgs");
		al.add("acd");
		al.add("abc");
		al.add("abcde");
		al.add("acdb");
		String[] s= {"qwerty","bacb","abcde","abc","acd","desdcd","qeesafs"};
		Arrays.sort(s);
		List<String> l=Arrays.asList(s);
		System.out.println(l);
		SortStringLengthwise ss=new SortStringLengthwise();
		Collections.sort(al,ss);
		System.out.println(al);
		int cnt=0;
		for(int i=0;i<al.size();i++) {
			for(int j=i+1;j<al.size();j++) {
				boolean flag=al.get(j).indexOf(al.get(i))==0?true:false;
				if(flag)
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}
