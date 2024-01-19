package springbootdeveloper;

import org.springframework.web.bind.annotation.GetMapping;

public class Test {
    @GetMapping("/test")
    public String test(){
        return "Hello World";
    }
}
