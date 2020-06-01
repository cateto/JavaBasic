import java.util.Scanner;

class 자전거
{
	String 색 = "검은색";
	int 단 = 1;
	
	자전거(){
	}

	자전거(String 색){

	this.색 = 색;

	}

	자전거(int 단){

	this.단 = 단;

	}

	

	
}

class 신호등

{	
	String 불 = "초록";
	

	신호등(){

	}
	
	신호등(String 불){

	this.불 = 불;

	}

}


class 날씨

{
	String 날 = "맑다";
	
	날씨(){

	}

	날씨(String 날){

	this.날 = 날;

	}


}

class 운전자 
{
	int 나이 = 13;
	자전거 거1, 거2, 거3, 거4;
	날씨 날1, 날2;
	신호등 등1, 등2;

	void 비교한다(){
	
	int 나이 = 13;
	int 입력 = 0;
	
	Scanner sc = new Scanner(System.in);
	System.out.print("당신의 나이를 입력하세요(1~200까지의 숫자) : ");
	입력 = sc.nextInt();

	if(입력 >= 나이) {
		System.out.println("자전거를 탈 수 있습니다. 시작!");

	}else {
		System.out.println("자전거를 탈 수 없습니다. 다음에 다시 도전하세요!");

	}

	sc.close();
	}


	void 타러간다(){

	날1 = new 날씨();
	날2 = new 날씨("흐리다");

	System.out.println("나는 날씨가 "+날1.날+"면 자전거를 타러간다.");
	System.out.println("나는 날씨가 "+날2.날+"면 자전거를 타러가지 않는다.");
	}
	

	void 탄다(){
	거1 = new 자전거();
	거2 = new 자전거("초록색");
	거3 = new 자전거(2);
	거4 = new 자전거(3);
	
	System.out.println("내가 자주타는 따릉이의 색은 "+거2.색+"이다.");
	System.out.println("내가 소장한 자전거의 색은 "+거1.색+"이다.");
	System.out.println("언덕을 오를 때에는 "+거1.단+"단으로 달린다.");
	System.out.println("천천히 갈 때에는 "+거3.단+"단으로 달린다.");
	System.out.println("빠르게 달릴 때에는 "+거4.단+"단으로 달린다.");

	}	

	void 출발한다(){

	등1 = new 신호등();
	등2 = new 신호등("빨강");	

	System.out.println("신호등의 색이 " + 등1.불 + "이면 출발한다.");
	System.out.println("신호등의 색이 " + 등2.불 + "이면 멈춘다.");
	}



}

class 신 

{	public static void main(String []args){
	
	운전자 운 = new 운전자();
	System.out.println("자전거는 " +운.나이+ "세 이상 부터 탈 수 있다.");
	운.비교한다();
	System.out.println("==============재미있는 자전거 타기==============");
	운.타러간다();
	운.탄다();
	운.출발한다();
	System.out.println("============== 자전거 타기 끝! ==============");

	}



	
}

