# 프로그래머스 - 최댓값과 최솟값

public class GetMinMaxStr {

	public static void main(String[] args) {
		String s = "-1 -1";
		System.out.println(solution(s));
		
	}
  
	static public String solution (String s) {
		String[] sarr = s.split(" ");
		int max, min;
		max = min = Integer.parseInt(sarr[0]);
		
		for(int i=0; i<sarr.length; i++) {
			int num = Integer.parseInt(sarr[i]);
			if(num>max) {
				max = num;
			}
			if(num<min) {
				min = num;
			}
		}
		return min+" "+max;
	}
}
