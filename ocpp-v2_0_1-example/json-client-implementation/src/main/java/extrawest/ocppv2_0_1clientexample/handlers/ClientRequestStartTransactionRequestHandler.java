package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientRequestStartTransactionRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.RequestStartStopStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.RequestStartTransactionRequest;
import com.extrawest.ocpp_2_0_1.model.response.RequestStartTransactionResponse;

public class ClientRequestStartTransactionRequestHandler implements IClientRequestStartTransactionRequestHandler {
    @Override
    public RequestStartTransactionResponse handleRequestStartTransactionRequest(RequestStartTransactionRequest request) {
        System.out.println(request.toString());
        return new RequestStartTransactionResponse(RequestStartStopStatusEnumType.ACCEPTED);
    }
}
