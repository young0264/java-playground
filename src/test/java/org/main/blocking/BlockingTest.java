package org.main.blocking;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.util.StopWatch;

public class BlockingTest {

//    String THREE_SECOND_URL
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void nonBlocking() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
//        for (int i = 0; i < 3; i++) {
//            this.webTestClient
//                    .get()
//                    .uri();
//        }
    }

}
