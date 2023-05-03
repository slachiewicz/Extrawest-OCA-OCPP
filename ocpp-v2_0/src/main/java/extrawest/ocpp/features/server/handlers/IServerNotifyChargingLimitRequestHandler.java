package extrawest.ocpp.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.NotifyChargingLimitRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyChargingLimitResponse;

import java.util.UUID;

/** Central system handler of {@link NotifyChargingLimitRequest}s. */
public interface IServerNotifyChargingLimitRequestHandler {
    NotifyChargingLimitResponse handleNotifyChargingLimitRequest(
            UUID sessionIndex, NotifyChargingLimitRequest request);
}
