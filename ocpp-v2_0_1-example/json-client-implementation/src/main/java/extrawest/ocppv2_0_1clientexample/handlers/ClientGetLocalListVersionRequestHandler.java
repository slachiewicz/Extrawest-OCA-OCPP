package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetLocalListVersionRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.GetLocalListVersionRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetLocalListVersionResponse;

public class ClientGetLocalListVersionRequestHandler implements IClientGetLocalListVersionRequestHandler {
    @Override
    public GetLocalListVersionResponse handleGetLocalListVersionRequest(GetLocalListVersionRequest request) {
        System.out.println(request.toString());
        return new GetLocalListVersionResponse(1);
    }
}
