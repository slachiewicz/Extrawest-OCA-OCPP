package extrawest.ocpp.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerNotifyMonitoringReportRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.NotifyMonitoringReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.NotifyMonitoringReportResponse;

import java.util.UUID;

public class NotifyMonitoringReportFeature implements Feature {
    private final IServerNotifyMonitoringReportRequestHandler handler;

    public NotifyMonitoringReportFeature(IServerNotifyMonitoringReportRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleNotifyMonitoringReportRequest(sessionIndex, (NotifyMonitoringReportRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return NotifyMonitoringReportRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return NotifyMonitoringReportResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.NOTIFY_MONITORING_REPORT.value();
    }
}
