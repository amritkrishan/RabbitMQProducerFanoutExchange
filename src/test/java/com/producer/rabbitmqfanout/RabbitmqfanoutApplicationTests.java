package com.producer.rabbitmqfanout;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles({ "no_rabbit" })
@SpringBootTest
public class RabbitmqfanoutApplicationTests {

	@Test
	public void contextLoads() {
	}

}
