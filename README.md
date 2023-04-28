[![Java CI with Maven](https://github.com/extrawest/Extrawest-OCA-OCPP/actions/workflows/maven.yml/badge.svg)](https://github.com/extrawest/Extrawest-OCA-OCPP/actions/workflows/maven.yml)
[![codecov](https://codecov.io/gh/ChargeTimeEU/Java-OCA-OCPP/branch/master/graph/badge.svg)](https://codecov.io/gh/ChargeTimeEU/Java-OCA-OCPP)
[![Gitter](https://badges.gitter.im/ChargeTimeEU/Java-OCA-OCPP.svg)](https://gitter.im/ChargeTimeEU/Java-OCA-OCPP?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

Java-OCA-OCPP
=============

A client and server library of Open Charge-Point Protocol from openchargealliance.org

With this library, you can easily get started with the Open Charge-Point Protocol.
The design is driven by test, which will ensure premium software that is easy to adapt and modify to your needs.

Please note, this is a library and not an application, so there is no main method. 

Currently we support 1.6 SOAP or Web socket and 2.0.1 Web socket versions.

At 1.6 version incoming request events are split into feature profiles as described in the OCPP specification. At 2.0.1 ypu can choose what kind of events will be supported by Central System or Charging Client.
I recommend that you download and read the specification from openchargealliance.org


1.6 Server Realization
=====
For realization 1.6 OCPP JsonServer you need next classes:

``` Java
@Configuration
@Slf4j
public class JsonServerConfig {

    @Bean
    public JSONServer jsonServer(ServerCoreProfile core) {
        return new JSONServer(core);
    }

}
```

``` Java
@Configuration
@Getter
@Slf4j
public class ServerCoreProfileConfig {

    @Bean
    public ServerCoreEventHandler getCoreEventHandler() {
        return new ServerCoreEventHandler() {
            @Override
            public AuthorizeConfirmation handleAuthorizeRequest(UUID sessionIndex, AuthorizeRequest request) {

                System.out.println(request);
                // ... handle event
                IdTagInfo idTagInfo = new IdTagInfo();
                idTagInfo.setExpiryDate(ZonedDateTime.now());
                idTagInfo.setParentIdTag("test");
                idTagInfo.setStatus(AuthorizationStatus.Accepted);

                return new AuthorizeConfirmation(idTagInfo);
            }

            @Override
            public BootNotificationConfirmation handleBootNotificationRequest(UUID sessionIndex, BootNotificationRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public DataTransferConfirmation handleDataTransferRequest(UUID sessionIndex, DataTransferRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public HeartbeatConfirmation handleHeartbeatRequest(UUID sessionIndex, HeartbeatRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public MeterValuesConfirmation handleMeterValuesRequest(UUID sessionIndex, MeterValuesRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public StartTransactionConfirmation handleStartTransactionRequest(UUID sessionIndex, StartTransactionRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public StatusNotificationConfirmation handleStatusNotificationRequest(UUID sessionIndex, StatusNotificationRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public StopTransactionConfirmation handleStopTransactionRequest(UUID sessionIndex, StopTransactionRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }
        };
    }

    @Bean
    public ServerCoreProfile createCore(ServerCoreEventHandler serverCoreEventHandler) {
        return new ServerCoreProfile(serverCoreEventHandler);
    }
}
```

``` Java
@Configuration
@Getter
@Slf4j
public class ServerEventConfig {

    @Bean
    public ServerEvents createServerCoreImpl() {
        return getNewServerEventsImpl();
    }

    private ServerEvents getNewServerEventsImpl() {
        return new ServerEvents() {

            @Override
            public void newSession(UUID sessionIndex, SessionInformation information) {

                // sessionIndex is used to send messages.
                System.out.println("New session " + sessionIndex + ": " + information.getIdentifier());
            }

            @Override
            public void lostSession(UUID sessionIndex) {

                System.out.println("Session " + sessionIndex + " lost connection");
            }
        };
    }
}
```

``` Java
@Configuration
@EnableConfigurationProperties
@Getter
public class ApplicationConfiguration {

    @Value("${server.port}")
    private Integer serverPort;
}
```

``` Java
@Slf4j
@Component
@AllArgsConstructor
public class JsonServerImpl {

    private final ServerEvents serverEvents;
    private final JSONServer server;
    private final ApplicationConfiguration applicationConfiguration;

    @PostConstruct
    public void startServer() throws Exception {
        server.open("localhost", applicationConfiguration.getServerPort(), serverEvents);
    }
}
```

For realization 1.6 OCPP JsonClient you need next classes:

``` Java
@Configuration
@Slf4j
public class JsonClientConfig {

    @Bean
    public JSONClient configureJsonClient(ClientCoreProfile core) {
        return new JSONClient(core);
    }
}
```

```Java
@Configuration
@Slf4j
public class ClientCoreProfileConfig {

    @Bean
    public ClientCoreProfile configureClientCoreProfile(ClientCoreEventHandler clientCoreEventHandler) {
        return new ClientCoreProfile(clientCoreEventHandler);
    }
}
```

``` Java
@Configuration
@Slf4j
public class ClientCoreEventHandlerConfig {

    @Bean
    public ClientCoreEventHandler configTestClient() {
        return new ClientCoreEventHandler() {
            @Override
            public ChangeAvailabilityConfirmation handleChangeAvailabilityRequest(ChangeAvailabilityRequest request) {

                System.out.println(request);
                // ... handle event

                return new ChangeAvailabilityConfirmation(AvailabilityStatus.Accepted);
            }

            @Override
            public GetConfigurationConfirmation handleGetConfigurationRequest(GetConfigurationRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public ChangeConfigurationConfirmation handleChangeConfigurationRequest(ChangeConfigurationRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public ClearCacheConfirmation handleClearCacheRequest(ClearCacheRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public DataTransferConfirmation handleDataTransferRequest(DataTransferRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public RemoteStartTransactionConfirmation handleRemoteStartTransactionRequest(RemoteStartTransactionRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public RemoteStopTransactionConfirmation handleRemoteStopTransactionRequest(RemoteStopTransactionRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public ResetConfirmation handleResetRequest(ResetRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }

            @Override
            public UnlockConnectorConfirmation handleUnlockConnectorRequest(UnlockConnectorRequest request) {

                System.out.println(request);
                // ... handle event

                return null; // returning null means unsupported feature
            }
        };
    }
}
```

```Java
public class OCPPHandlerTest {

    @Autowired
    private JSONClient jsonClient;

    @Autowired
    private ClientCoreProfile clientCoreProfile;

    @Autowired
    private ApiConfigurations apiConfigurations;

    @PostConstract
    public void testOCPPAuthorizeHandler() {
        String url = "ws://" + apiConfigurations.getWebSocketBaseUrl();
        AuthorizeRequest testRequest = clientCoreProfile.createAuthorizeRequest("testId");
        jsonClient.connect(url, null);
        try {
            AuthorizeConfirmation authorizeConfirmation = (AuthorizeConfirmation) jsonClient.send(testRequest)
                    .toCompletableFuture().get();
            assertTrue(true);
            assertEquals(AuthorizationStatus.Accepted,authorizeConfirmation.getIdTagInfo().getStatus());
        } catch (OccurenceConstraintException | UnsupportedFeatureException
                | ExecutionException | InterruptedException e) {
            log.error("Exception occurred: " + e);
            log.error("Test will fail");
            assertTrue(false);
        }
    }
}
```

Maven
=====

Find the maven repo here: https://mvnrepository.com/artifact/eu.chargetime.ocpp

Dependencies
============

Java-OCA-OCPP uses the following libraries:

* [Groovy-2.4](http://www.groovy-lang.org/)
* [JUnit4](http://junit.org/junit4/)
* [org.hamcrest:hamcrest-all:1.3](http://hamcrest.org)
* [org.mockito:mockito-core:1.10.19](http://mockito.org)
* [spock-core-0.7-groovy-2.0](http://spockframework.org)

To use version 1.6 you need the following libraries:

* [com.google.code.gson](https://github.com/google/gson)
* [org.java_websocket](https://github.com/TooTallNate/Java-WebSocket)

License
=======

[MIT License](LICENSE)

About Extrawest.com
=======

We are devoted to push the marked for vehicles charging forward.
There are many standards out there, we intend to implement and share them. Any help is much appreciated!

The market is in its defining state, the practices and standards we come up with now, may very well stick around for decades to come.

See our vision at https://www.extrawest.com/
