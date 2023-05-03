package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerHeartbeatRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.HeartbeatRequest;
import com.extrawest.ocpp_2_0_1.model.response.HeartbeatResponse;

import java.time.LocalDateTime;
import java.util.UUID;

public class ServerHeartbeatRequestHandler implements IServerHeartbeatRequestHandler {
    @Override
    public HeartbeatResponse handleHeartbeatRequest(UUID sessionIndex, HeartbeatRequest request) {
        return new HeartbeatResponse(LocalDateTime.now());
    }
}
