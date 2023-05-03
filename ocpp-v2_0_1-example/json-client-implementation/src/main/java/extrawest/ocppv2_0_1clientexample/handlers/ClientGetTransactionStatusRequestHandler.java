package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetTransactionStatusRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.GetTransactionStatusRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetTransactionStatusResponse;

public class ClientGetTransactionStatusRequestHandler implements IClientGetTransactionStatusRequestHandler {
    @Override
    public GetTransactionStatusResponse handleGetTransactionRequest(GetTransactionStatusRequest request) {
        System.out.println(request.toString());
        return new GetTransactionStatusResponse(true);
    }
}
