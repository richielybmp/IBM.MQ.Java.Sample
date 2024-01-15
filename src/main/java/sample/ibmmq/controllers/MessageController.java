package sample.ibmmq.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.ibmmq.services.MQProducer;

@RestController
@RequestMapping("/api/ibmmq")
public class MessageController {

    private final MQProducer ibmmqService;

    public MessageController(MQProducer ibmmqService) {
        this.ibmmqService = ibmmqService;
    }

    @GetMapping("{message}")
    public ResponseEntity<String> publish(@PathVariable String message) {
        ibmmqService.pubish(message);
        return ResponseEntity.ok(message);
    }
}