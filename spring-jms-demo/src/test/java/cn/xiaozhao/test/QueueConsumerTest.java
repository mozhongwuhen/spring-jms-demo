package cn.xiaozhao.test;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-jms-consumer-queue.xml")
public class QueueConsumerTest {
	 @Test
     public void testReceive(){
    	 try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
     }
}
