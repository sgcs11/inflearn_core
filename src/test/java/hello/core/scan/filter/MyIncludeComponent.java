package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) //class에 붙일 어노테이션
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyIncludeComponent {
}
