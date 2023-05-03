package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.SendLocalListRequest;
import com.extrawest.ocpp_2_0_1.model.response.SendLocalListResponse;

/** Charging Station handler of {@link SendLocalListRequest} */
public interface IClientSendLocalListRequestHandler {
    SendLocalListResponse handleSendLocalListRequest(SendLocalListRequest request);
}
