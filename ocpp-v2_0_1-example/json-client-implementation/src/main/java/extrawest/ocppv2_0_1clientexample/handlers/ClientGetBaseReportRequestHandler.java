package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetBaseReportRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GenericDeviceModelStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.GetBaseReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetBaseReportResponse;

public class ClientGetBaseReportRequestHandler implements IClientGetBaseReportRequestHandler {
    @Override
    public GetBaseReportResponse handleGetBaseReportRequest(GetBaseReportRequest request) {
        System.out.println(request.toString());
        return new GetBaseReportResponse(GenericDeviceModelStatusEnumType.ACCEPTED);
    }
}
