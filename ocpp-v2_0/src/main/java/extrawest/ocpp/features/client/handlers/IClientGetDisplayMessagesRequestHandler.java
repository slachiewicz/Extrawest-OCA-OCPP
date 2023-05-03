package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.GetDisplayMessagesRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetDisplayMessagesResponse;

/** Charging Station handler of {@link GetDisplayMessagesRequest} */
public interface IClientGetDisplayMessagesRequestHandler {
    GetDisplayMessagesResponse handleGetDisplayMessagesRequest(GetDisplayMessagesRequest request);
}
