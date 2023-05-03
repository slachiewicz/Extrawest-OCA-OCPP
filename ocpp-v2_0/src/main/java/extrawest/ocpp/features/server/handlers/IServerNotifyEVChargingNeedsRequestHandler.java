package extrawest.ocpp.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.NotifyEVChargingNeedsRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyEVChargingNeedsResponse;

import java.util.UUID;

/** Central system handler of {@link NotifyEVChargingNeedsRequest}s. */
public interface IServerNotifyEVChargingNeedsRequestHandler {
    NotifyEVChargingNeedsResponse handleNotifyEVChargingNeedsRequest(
            UUID sessionIndex, NotifyEVChargingNeedsRequest request);
}
