package com.estsoft.springproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class JUnitTest {
    @Test
    public void test(){
        //given
        int a = 1;
        int b = 2;

        //when:검증하고 싶은 메소드(코드)호출.
        int sum = a + b;

        //then: when절 실행 결과 검증
        //Assertions.assertEquals(3, sum);
        assertThat(sum).isEqualTo(3);

        //Assertions.assertThat(sum).isEven();
        assertThat(sum).isOdd();
    }
}
