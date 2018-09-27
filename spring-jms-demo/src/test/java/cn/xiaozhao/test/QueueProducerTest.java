package cn.xiaozhao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.xiaozhao.demo.QueueProducer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-jms-producer-queue.xml")
public class QueueProducerTest {
	@Autowired
	private QueueProducer queueProducer;
    @Test
    public void testSend(){
    	queueProducer.sendTextMessage("spring-jms 点对点模式");
    }
}
