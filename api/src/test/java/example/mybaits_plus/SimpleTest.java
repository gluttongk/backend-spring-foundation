package example.mybaits_plus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleTest {
    @Test
    void test() {
        int a = 1;
        int b = 1;

        Assertions.assertEquals(a, b);
    }
}