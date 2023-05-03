package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientDataTransferRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.DataTransferStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.DataTransferRequest;
import com.extrawest.ocpp_2_0_1.model.response.DataTransferResponse;

public class ClientDataTransferRequestHandler implements IClientDataTransferRequestHandler {
    @Override
    public DataTransferResponse handleCancelDataTransferRequest(DataTransferRequest request) {
        System.out.println(request.toString());
        return new DataTransferResponse(DataTransferStatusEnumType.ACCEPTED);
    }
}
