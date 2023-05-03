package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyCustomerInformationRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.NotifyCustomerInformationRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyCustomerInformationResponse;

import java.util.UUID;

public class ServerNotifyCustomerInformationRequestHandler implements IServerNotifyCustomerInformationRequestHandler {
    @Override
    public NotifyCustomerInformationResponse handleNotifyCustomerInformationRequest(UUID sessionIndex, NotifyCustomerInformationRequest request) {
        return new NotifyCustomerInformationResponse();
    }
}
