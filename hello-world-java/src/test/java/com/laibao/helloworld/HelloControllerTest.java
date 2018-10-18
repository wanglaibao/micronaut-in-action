package com.laibao.helloworld;

import io.micronaut.context.ApplicationContext;
import io.micronaut.runtime.server.EmbeddedServer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

//@MicronautTest
public class HelloControllerTest {

//    @Inject
//    HelloControllerClient helloClient;

    private EmbeddedServer server;

    private HelloControllerClient client;

    @Before
    public void setup() {
        this.server = ApplicationContext.run(EmbeddedServer.class);
        this.client = server.getApplicationContext().getBean(HelloControllerClient.class);
    }

    @After
    public void cleanup() {
        this.server.stop();
    }

    @Test
    public void testHello() {
        //assertEquals("Hello Fred!", helloClient.hello("Fred").blockingGet());
        String response = client.hello("Fred").blockingGet();
        assertEquals(response, "Hello Fred!");

    }
}
