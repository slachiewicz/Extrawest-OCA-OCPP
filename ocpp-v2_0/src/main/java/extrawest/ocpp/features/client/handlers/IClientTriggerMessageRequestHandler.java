package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.TriggerMessageRequest;
import com.extrawest.ocpp_2_0_1.model.response.TriggerMessageResponse;

/** Charging Station handler of {@link TriggerMessageRequest} */
public interface IClientTriggerMessageRequestHandler {
    TriggerMessageResponse handleTriggerMessageRequest(TriggerMessageRequest request);
}
