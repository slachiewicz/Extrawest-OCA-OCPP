package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyMonitoringReportRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.NotifyMonitoringReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyMonitoringReportResponse;

import java.util.UUID;

public class ServerNotifyMonitoringReportRequestHandler implements IServerNotifyMonitoringReportRequestHandler {
    @Override
    public NotifyMonitoringReportResponse handleNotifyMonitoringReportRequest(UUID sessionIndex, NotifyMonitoringReportRequest request) {
        return new NotifyMonitoringReportResponse();
    }
}
