package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientCustomerInformationRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.CustomerInformationStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.CustomerInformationRequest;
import com.extrawest.ocpp_2_0_1.model.response.CustomerInformationResponse;

public class ClientCustomerInformationRequestHandler implements IClientCustomerInformationRequestHandler {
    @Override
    public CustomerInformationResponse handleCustomerInformationRequest(CustomerInformationRequest request) {
        System.out.println(request.toString());
        return new CustomerInformationResponse(CustomerInformationStatusEnumType.ACCEPTED);
    }
}
