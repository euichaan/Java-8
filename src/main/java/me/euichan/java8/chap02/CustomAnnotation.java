package me.euichan.java8.chap02;

public @interface CustomAnnotation {

	// .java -> javac -> .class

	// SOURCE: javac -> .class 클래스 파일에 이 애노테이션 정보가 없어요!
	// CLASS(default): .class 파일에 유지, 런타임에는 사용할 수 없습니다

	// .class
	// RUNTIME: 런타임에 사용 가능. reflection API 등으로 애노테이션 정보를 뽑아 쓸 수 있다.
}
