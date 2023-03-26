package com.bourntec.HITHRON;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import com.bourntec.HITHRON.controller.UserController;

@SpringBootTest
public class SmokeTest {
    @Autowired
    UserController userController;
    @Test
    public void loadContext(){
        assertThat(userController).isNotNull();
    }

}
