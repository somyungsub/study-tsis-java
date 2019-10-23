# 6장 AOP
 
AOP는 IOC/DI, 서비스 추상화와 더불어 스프링의 3대 기반 기술 중 하나이다.

Point1. 트랜잭션 코드와 비지니스 코드가 분리 가능하다면 분리!


Stroy1. UserService를 추상화 해 비지니스 로직, 트랜잭션 로직을 UserService를 토대로 구현해 나눈 뒤 트랜잭션 로직에서 비지니스 로직을 품고 실행시키는 구조로 만든다. 그럼 Client는 트랜잭션 로직에 사용하고자하는 UserServcie를 DI해 코드를 분리하고 트랜잭션도 적용시키며 사용 할 수 있다.

Point2. 의존관계에 의해 테스트가 어려울 때는 테스트대상을 고립시킨다. 예를 들어 서비스를 테스트 하려고 한다면, 따로 DAO등 테스트를 위한 의존관계에 위치에있는 오브젝트를 만든다.

*  Mockito툴 사용법 알면 좋다.

Client가 핵심기능을 사용하는 것 같지만 실제는 부가기능이 핵심기능을 사용하게 끔 해야한다. 이것이 프록시 패턴이다.

프록시의 역할은 위임과 부가작업 두 가지로 구분.

프록시를 만들기 번거러운 이유 및 방안
- 타깃의 인터페이스를 구현하고 위임하는 코드를 작성하기가 번거롭다.
>  JDK 다이내믹 프록시
- 부가기능 코드가 중복될 가능성이 많다.

자바의 모든 클래스는 그 클래스 자체의 구성정보를 담은 Class 타입의 오브젝트를 하나씩 갖고 있다. '클래스이름.class' 혹은 getClass() 메소드를 호출. 그것을 reflect를 이용해 사용 가능.

# 리스트 6-17 리플렉션 학습 테스트

public class ReflectionTest {
	@Test
	public void invokeMethod() throws Exception {
		String name = "Spring";
		
		//length()
		assertThat(name.length(), is(6));

		Method lengthMethod = String.class.getMethod("length");
		assertThat((Integer)lengthMethod.invoke(name), is(6));

		//charAt()
		assertThat(name.charAt(0), is('S'));

		Method charAtMethod = String.class.getMethod("charAt",int.class);
		assertThat((Character)charAtMethod.invoke(name,0), is('S'));
	}

}

# 리스트 6-23 부터 ~ 28까지 해보기

스프링에서 팩토리 빈을 여러가지 방법중 가장 간단한 방법은 FactoryBean 인터페이스 구현!

Point3. private 생성자를 가지 클래스는 빈으로 등록할수는 있지만 지양한다. reflect는 private으로 선언된 접근 규약을 위반할 정도로 강력.

팩토리 빈 자체를 가져오고 싶을 경우에는 getBean("&이름")으로 한다.


