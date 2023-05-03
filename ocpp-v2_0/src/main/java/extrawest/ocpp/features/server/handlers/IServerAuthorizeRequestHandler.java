package extrawest.ocpp.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.AuthorizeRequest;
import com.extrawest.ocpp_2_0_1.model.response.AuthorizeResponse;

import java.util.UUID;

/** Central system handler of {@link AuthorizeRequest}s. */
public interface IServerAuthorizeRequestHandler {
    AuthorizeResponse handleAuthorizeRequest(
            UUID sessionIndex, AuthorizeRequest request);
}
