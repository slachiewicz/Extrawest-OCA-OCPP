package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientRequestStopTransactionRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.RequestStartStopStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.RequestStopTransactionRequest;
import com.extrawest.ocpp_2_0_1.model.response.RequestStopTransactionResponse;

public class ClientRequestStopTransactionRequestHandler implements IClientRequestStopTransactionRequestHandler {
    @Override
    public RequestStopTransactionResponse handleRequestStopTransactionRequest(RequestStopTransactionRequest request) {
        System.out.println(request.toString());
        return new RequestStopTransactionResponse(RequestStartStopStatusEnumType.ACCEPTED);
    }
}
