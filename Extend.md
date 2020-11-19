# Java Study

## 클래스 타입 변환

**다른 클래스 타입으로 객체를 대입하는 것을 말함**

```java
Parent parent = new Child();
```



## 자동 타입 변환

**자식 객체를 부모 타입 변수에 대입할 때 자동으로 타입이 변환됨**

```java
//부모타입 변수 = 자식타입;

Cat cat = new Cat();
Animal animal = cat;
//cat과 animal 변수는 타입만 다를 뿐, 동일한 Cat 객체를 참조함
```



## 강제 타입 변환

**자식 객체가 부모 타입으로 변환된 상태에서 다시 원래의 자식 타입으로 변환하고자 할 때 캐스팅 연산자() 를 사영하여 강제 타입 변환 가능**

```java
//자식타입 변수 = (자식타입) 부모타입;

Parent parent = new Child() // 자동 타입 변환
Child child = (Child) parent; // 강제 타입 변환
```



## instanceof 연산자

**객체가 어떤 타입인지 조사할 때 사용(주로 강제 타입 변환 전에 사용)**

```java
boolean result = 좌향(객체) instanceof 우항(타입)
    
public void method(Parent parent) {
    if(parent instanceof Child) {
        Child child = (Child) parent;
    }
}
```

**타입을 확인하지 않고 강제 타입 변환을 시도한다면 ClassCastException 발생, (instanceof으로 해결)**



## 다형성

**객체 사용 방법은 동일, 실행결과가 다양하게 나오는 성질**

메소드 재정의와 타입 변환을 통해 구현



# 참고

**<혼자 공부하는 자바 - 상속> 내용 참고 **