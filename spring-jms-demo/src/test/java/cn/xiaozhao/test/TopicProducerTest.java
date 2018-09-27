package cn.xiaozhao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.xiaozhao.demo.QueueProducer;
import cn.xiaozhao.demo.TopicProducer;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext-jms-producer-topic.xml")
public class TopicProducerTest {
	@Autowired
	private TopicProducer topicProducer;
    @Test
    public void testSend(){
    	topicProducer.sendTextMessage("spring-jms 发布订阅模式");
    }
}
