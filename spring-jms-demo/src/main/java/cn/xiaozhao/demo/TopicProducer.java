package cn.xiaozhao.demo;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class TopicProducer {
	/**发布订阅-生产者
	 * @param args
	 */
	@Autowired
    private JmsTemplate	jmsTemplate;
	@Autowired
	private Destination topicTextDestination;
	
	public void sendTextMessage(final String text){
		jmsTemplate.send(topicTextDestination,new MessageCreator() {	
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(text);
			}
		});
	}
}
