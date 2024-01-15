package sample.ibmmq.services.background;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MQConsumer {

    private static final String QUEUE = "DEV.QUEUE.1";

    @JmsListener(destination = QUEUE)
    public void receiveMessage(String message) {
        log.info("Received message: {}", message);
    }
}