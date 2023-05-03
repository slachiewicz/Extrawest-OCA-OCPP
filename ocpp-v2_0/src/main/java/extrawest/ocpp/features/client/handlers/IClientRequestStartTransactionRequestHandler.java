package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.RequestStartTransactionRequest;
import com.extrawest.ocpp_2_0_1.model.response.RequestStartTransactionResponse;

/** Charging Station handler of {@link RequestStartTransactionRequest} */
public interface IClientRequestStartTransactionRequestHandler {
    RequestStartTransactionResponse handleRequestStartTransactionRequest(RequestStartTransactionRequest request);
}
