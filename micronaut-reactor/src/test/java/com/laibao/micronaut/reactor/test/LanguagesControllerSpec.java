package com.laibao.micronaut.reactor.test;

import io.micronaut.context.ApplicationContext;
import io.micronaut.core.type.Argument;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.HttpClient;
import io.micronaut.runtime.server.EmbeddedServer;
import spock.lang.AutoCleanup;
import spock.lang.Shared;
import spock.lang.Specification;

public class LanguagesControllerSpec extends Specification {
    @AutoCleanup
    @Shared
    private static EmbeddedServer server = ApplicationContext.run(EmbeddedServer.class);

    @AutoCleanup
    @Shared
    private static HttpClient client = server.getApplicationContext().createBean(HttpClient.class, server.getURL());
}
