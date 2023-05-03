package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerReportChargingProfilesRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.ReportChargingProfilesRequest;
import com.extrawest.ocpp_2_0_1.model.response.ReportChargingProfilesResponse;

import java.util.UUID;

public class ServerReportChargingProfilesRequestHandler implements IServerReportChargingProfilesRequestHandler {
    @Override
    public ReportChargingProfilesResponse handleReportChargingProfilesRequest(UUID sessionIndex, ReportChargingProfilesRequest request) {
        return new ReportChargingProfilesResponse();
    }
}
