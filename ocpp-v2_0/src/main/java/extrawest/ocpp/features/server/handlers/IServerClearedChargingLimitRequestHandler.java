package extrawest.ocpp.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.ClearedChargingLimitRequest;
import com.extrawest.ocpp_2_0_1.model.response.ClearedChargingLimitResponse;

import java.util.UUID;

/** Central system handler of {@link ClearedChargingLimitRequest}s. */
public interface IServerClearedChargingLimitRequestHandler {
    ClearedChargingLimitResponse handleClearedChargingLimitRequest(
            UUID sessionIndex, ClearedChargingLimitRequest request);
}
