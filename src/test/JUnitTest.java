package test;
import io.reactivex.rxjava3.core.*;
import org.junit.Test;

public class JUnitTest {
    @Test
    public void test(){
        System.out.println("aaa");
        Flowable.just("Hello world").subscribe(System.out::println);
    }
}
