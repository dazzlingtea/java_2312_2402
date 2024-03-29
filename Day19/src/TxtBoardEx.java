
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

class Article {
	int id;
	String title, content;
	
	Article(int id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
	
	public String toString() {
		return String.format("{id: %d, title: \"%s\", content: \"%s\"}"
				, id, title, content);
	}
}

public class TxtBoardEx {
	static void makeTestData(List<Article> articles) {
		articles.add(new Article(1, "제목1", "내용1"));
		articles.add(new Article(2, "제목2", "내용2"));
		articles.add(new Article(3, "제목3", "내용3"));
		
	}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int articleLastId = 0;
    Article lastArticle = null;
    List<Article> articles = new ArrayList<>();
    
    makeTestData(articles);
    
    System.out.println("== 자바 텍스트 게시판 ==");
    System.out.println("== 프로그램 시작 ==");

    while (true) {
      System.out.printf("명령) ");
      String cmd = sc.nextLine();
      
      if(cmd.equals("/usr/article/write")) {
    	  System.out.println("== 게시물 등록 ==");
    	  System.out.printf("제목 : ");
    	  String title = sc.nextLine();
    	  
    	  System.out.printf("내용 : "); 
    	  String content = sc.nextLine();
    	  
    	  int id = articleLastId + 1;
    	  articleLastId++;
    	  
    	  Article article = new Article(id, title, content);
    	  lastArticle = article;
    	  
    	  System.out.printf("%d번 게시물이 등록되었습니다.\n", id);
    	  System.out.println("생성된 객체: "+article);
    	  continue;
      }
      else if(cmd.equals("/usr/article/list")) {
    	  System.out.println("==게시물 리스트==");
    	  // 최근 게시물이 리스트 위에 있어야 함 3->2->1순서
    	  for(int i = articles.size() - 1; i >= 0; i--) {
    		  Article article = articles.get(i);
    		  System.out.println(article.id+" / "+article.title);
    	  }
    	  /* 향상된 for문 정순만 가능
    	  for(Article article : articles) {
    		  System.out.printf("%d / %s", article.id, article.title);
    	  }*/
    	  
      }
      else if(cmd.equals("/usr/article/detail")) {
    	  if(lastArticle == null) {
    		  System.out.println("게시물이 존재하지 않습니다."); 
    		  continue;
    	  }
    	  
    	  Article article = lastArticle;
    	  
    	  System.out.println("==게시물 상세보기==");
    	  System.out.printf("번호:%d\n제목:%s\n내용:%s\n",
    			  article.id, article.title, article.content);
    	  continue;
      }
      else if(cmd.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }
      
      
      System.out.printf("입력 된 명령어 : %s\n", cmd);
    }

    sc.close();
  }
}