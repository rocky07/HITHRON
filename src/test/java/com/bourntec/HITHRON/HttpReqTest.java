package com.bourntec.HITHRON;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpReqTest {
    
    @Value(value="${local.server.port}")
	private int port;

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void defaultgreeting(){
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/user/test",
        String.class)).contains("hello world");
    }

}
