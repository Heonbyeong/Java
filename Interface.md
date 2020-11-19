# Java Study

# 인터페이스

**객체의 사용 방법을 정의한 타입**

(개발 코드가 인터페이스의 메소드를 호출하면 인터페이스는 객체의 메소드를 호출)



**중간에 인터페이스를 두는 이유?**

: 개발 코드를 수정하지 않고 사용하는 객체를 변경할 수 있도록 하기 위해



# 인터페이스 선언

인터페이스 선언은 class 키워드 대신에 interface 키워드를 사용

```java
[public] interface 인터페이스 이름 { ... }


/*
interface 인터페이스 이름 {
	//상수
	타입 상수이름 = 값;
	//추상 메소드
	타입 메소드이름(매개변수, ...)
}
*/
```

**인터페이스는 상수 필드, 추상 메소드만을 구성 멤버로 가짐 (생성자 X)**



## 상수 필드 선언

인터페이스에서 **상수 필드**는 선언이 가능(인스턴스, 정적필드 (X))  단, 실행시 데이터 변경 불가

인터페이스에 선언된 모든 필드 = **public static final**의 특성을 가짐 (생략 O)

```java
[public static final] 타입 상수이름 = 값;
//인터페이스 상수는 선언과 동시에 초기값 지정하기
```



## 추상 메소드 선언

인터페이스를 통해 호출된 메소드 >> 객체에서 실행

따라서 인터페이스의 메소드는 **실팽 블록이 필요 없는 추상 메소드**로 선언

```java
[public abstract] 리턴타입 메소드이름(매개변수, ...)
```



# 인터페이스 구현

인터페이스가 객체의 메소드를 호출하면 객체는 인터페이스에 정의된 추상 메소드와 동일한 실체 메소드를 가지고 있어야 함 >>이러한 객체를 **인터페이스의 구현 객체**, 구현 객체를 생성하는 클래스를 **구현 클래스**라고 함 



## 구현 클래스

선언부에 **implements** 키워드 추가, 인터페이스 이름 명시 >> 인터페이스 타입으로 사용할 수 있음을 알려주기 위함

```java
public class 구현클래스이름 implements 인터페이스이름 {
    //인터페이스에 선언된 추상 메소드의 실체 메소드 선언
}
```



구현 클래스가 작성되면 new 연산자로 객체 생성 가능

```java
인터페이스 변수;
변수 = 구한객체;

or
    
인터페이스 변수 = 구현객체;
```



## 다중 인터페이스 구현 클래스

인터페이스 A와 B가 객체의 메소드를 호출하려면 객체는 두 인터페이스를 모두 구현해야함

```java
public class 구현클래스이름 implements 인터페이스A, 인터페이스B{
    //인터페이스 A에 선언된 추상 메소드의 실체 메소드 선언
    //인터페이스 B에 선언된 추상 메소드의 실체 메소드 선언
}
```



## 인터페이스 사용

클래스를 선언할 때 인터페이스는 필드, 생성자 또는 메소드의 매개 변수, 생성자 또는 메소드의 로컬 변수로 선언될 수 있었다.

```java
//RemoteControl = 인터페이스

public class MyClass{
    //필드
    RemoteControl rc = new Television();
    
    //생성자
    MyClass(RemoteControl rc){
        this.rc = rc;
    }
    
    //메소드
    void methodA(){
        //로컬 변수
        RemoteControl rc = new Audio();
    }
    
    void methodB(RemoteControl rc) { ... }
}
```



### 필드로 선언된 rc

```java
MyClass myClass = new MyClass();
myClass.rc.trunOn(); //Television의 turnOn() 실행
myClass.rc.setVolume(5) //Television의 setVolume(5) 실행
```



### 생성자의 매개 변수 타입으로 선언된 rc

```java
MyClass(RemoteControl rc){
    this.rc = rc;
    rc.turnOn();
    rc,setVolume(5);
}
```



### 로컬 변수로 선언된 rc

```java
void methodA(){
    RemoteControl rc = new Audio();
    rc.turnOn();
    rc.setVolume(5);
}
```



### 메소드의 매개 변수 타입으로 선언된 rc

```java
void methodB(RemoteControl rc){
    re.turnOn();
    rc.setVolume(5);
}
```





## 참고

<혼자 공부하는 자바 - 인터페이스> 참고