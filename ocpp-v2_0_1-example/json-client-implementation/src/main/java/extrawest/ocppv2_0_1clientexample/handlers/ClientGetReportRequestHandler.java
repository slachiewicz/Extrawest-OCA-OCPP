package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetReportRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GenericDeviceModelStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.GetReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetReportResponse;

public class ClientGetReportRequestHandler implements IClientGetReportRequestHandler {
    @Override
    public GetReportResponse handleGetReportRequest(GetReportRequest request) {
        System.out.println(request.toString());
        return new GetReportResponse(GenericDeviceModelStatusEnumType.ACCEPTED);
    }
}
