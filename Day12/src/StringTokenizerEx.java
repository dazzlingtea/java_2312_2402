import java.util.StringTokenizer; //*
public class StringTokenizerEx {

	public static void main(String[] args) {
		 String query = "id=hgd&pw=qwer1234&age=30";
		 StringTokenizer st = new StringTokenizer(query, "&");
		 
		 int tokens = st.countTokens();
		 System.out.println(tokens);
		 for(int i=0; i<tokens; i++) {
			 String cur = st.nextToken(); //�ϳ��� ������
			 System.out.println(cur);
		 }
		 // ���й��� 2����
		 StringTokenizer st2 = new StringTokenizer(query, "&=");
		 
		 int tokens2 = st2.countTokens();
		 System.out.println(tokens2);
		 for(int i=0; i<tokens2; i++) {
			 String cur = st2.nextToken(); //�ϳ��� ������
			 System.out.println(cur);
		 }
		 
		 StringTokenizer st3 = new StringTokenizer(query);
		 
		 int tokens3 = st3.countTokens();
		 System.out.println(tokens3);
		 
		 
		 

	}

}
