package extrawest.ocppv2_0_1clientexample.handlers;

import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetMonitoringReportRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GenericDeviceModelStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.GetMonitoringReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetMonitoringReportResponse;

public class ClientGetMonitoringReportRequestHandler implements IClientGetMonitoringReportRequestHandler {
    @Override
    public GetMonitoringReportResponse handleGetMonitoringReportRequest(GetMonitoringReportRequest request) {
        System.out.println(request.toString());
        return new GetMonitoringReportResponse(GenericDeviceModelStatusEnumType.ACCEPTED);
    }
}
