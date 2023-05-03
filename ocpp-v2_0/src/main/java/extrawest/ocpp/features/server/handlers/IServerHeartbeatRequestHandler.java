package extrawest.ocpp.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.HeartbeatRequest;
import com.extrawest.ocpp_2_0_1.model.response.HeartbeatResponse;

import java.util.UUID;

/** Central system handler of {@link HeartbeatRequest}s. */
public interface IServerHeartbeatRequestHandler {
    HeartbeatResponse handleHeartbeatRequest(
            UUID sessionIndex, HeartbeatRequest request);
}
