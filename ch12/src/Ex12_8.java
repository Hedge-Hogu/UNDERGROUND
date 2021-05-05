import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

@Deprecated
@SuppressWarnings("1111") // 유효하지않은 에너태이션은 무시된다.
@TestInfo(testedBy="aaa", testTools ={"JUnit", "JUnit5"}, testDate=@DateTime(yymmdd="160101", hhmmss="235959")	)
public class Ex12_8 {
	public static void main(String[] args) {
		Class<Ex12_8> cls = Ex12_8.class;
		
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
		System.out.println(anno.testDate());
		System.out.println("anno.testDate().yymmdd()="+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()="+anno.testDate().hhmmss());
		
		for(String str : anno.testTools())
			System.out.println("testTools="+str);
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations();
		
		System.out.println(Arrays.deepToString(annoArr));
		System.out.println();
		
		for(Annotation a : annoArr)
			System.out.println(a);
	}

}

@Retention(RetentionPolicy.RUNTIME) // 실행시에 사용가능
@interface TestInfo {
	int 		count() 	default 1;
	String 		testedBy();
	String[] 	testTools() default "JUnit";
	TestType 	testType() 	default TestType.FIRST;
	DateTime	testDate();
	
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }