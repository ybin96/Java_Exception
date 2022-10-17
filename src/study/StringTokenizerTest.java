package study;

import java.util.StringTokenizer;
class StringTokenizerTest {
	public static void main(String[] args) {
		String data = "행복:건강:돈:가족";
		StringTokenizer st = new StringTokenizer(data, ":");
		while( st.hasMoreTokens() ){
			String str = st.nextToken();
			System.out.println(str);
		}

	}
}
