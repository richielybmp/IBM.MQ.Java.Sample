package sample.ibmmq.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MQProducer {
    private final JmsTemplate jmsTemplate;
    private static final String QUEUE = "DEV.QUEUE.1";

    public MQProducer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void pubish(String message) {
        jmsTemplate.convertAndSend(QUEUE, message);
        log.info("Message {} published to queue: {}", message, QUEUE);
    }

}