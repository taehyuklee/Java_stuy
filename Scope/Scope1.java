package Scope;

//Scope가 탄생한 배경

public class Scope1 {

	//유효범위가 존재하게된 이유는 다음과 같다
	/*프로그램이 커지면 여러 가지 이유로 이름이 충돌하게 된다.
	 * 같은 이름을 누군가가 쓰게 될수 있기때문에 충돌을 막기 위해서 유효범위라는 개념을 도입했다. 
	 * 이것을 스코프 (Scope)이라 부른다*/
	
	static void a() {
		int i = 0;
	}
	
	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			a();
			System.out.println(i);
			
			/*Scope를 생각하지 않는다면, main함수 for문 안에 있는 i는 계속 ++가 될려고 하는데
			 *a() method가 i를 0으로 계속 초기화시킬 것이기때문에 무한반복이 될수 있다.
			 *그러나 그 결과는 그렇지 않다. 
			 *
			 *a()라는 method가 내가 만든 것이 아니라 누군가가 만든 것을 가져온 것이라면?
			 *그 안에 i가 들어있는지 없는지 알 방도가 없기때문에 (내가 i를 써도 되는지 안되는지)
			 *method안에서 선언한 변수는 그 method안에서만 유효하게 해놨다. 즉 선언한 변수가 유효한 범위 (Scope)를
			 *설정해 놓은 것이다. 위와 같은 충돌을 막기 위해서
			 *
			 *오래된 프로그래밍 언어는 전역변수밖에 없었다고 한다.
			 **/
		}
	}
	
}
