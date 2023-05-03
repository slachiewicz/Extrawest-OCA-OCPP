package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerClearedChargingLimitRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.ClearedChargingLimitRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearedChargingLimitResponse;

import java.util.UUID;

public class ServerClearedChargingLimitRequestHandler implements IServerClearedChargingLimitRequestHandler {
    @Override
    public ClearedChargingLimitResponse handleClearedChargingLimitRequest(UUID sessionIndex, ClearedChargingLimitRequest request) {
        return new ClearedChargingLimitResponse();
    }
}
