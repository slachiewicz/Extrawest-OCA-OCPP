package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyReportRequestHandler;
import com.extrawest.ocpp_2_0_1.model.request.NotifyReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyReportResponse;

import java.util.UUID;

public class ServerNotifyReportRequestHandler implements IServerNotifyReportRequestHandler {
    @Override
    public NotifyReportResponse handleNotifyReportRequest(UUID sessionIndex, NotifyReportRequest request) {
        return new NotifyReportResponse();
    }
}
