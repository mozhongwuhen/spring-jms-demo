package cn.xiaozhao.demo;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class QueueProducer {
	/**队列-生产者
	 * @param args
	 */
	@Autowired
    private JmsTemplate	jmsTemplate;
	@Autowired
	private Destination queueTextDestination;
	
	public void sendTextMessage(final String text){
		jmsTemplate.send(queueTextDestination,new MessageCreator() {	
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(text);
			}
		});
	}
}
