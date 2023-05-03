package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetMonitoringBaseRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.SetMonitoringBaseRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetMonitoringBaseResponse;

import java.util.UUID;

public class SetMonitoringBaseFeature implements Feature {
    private final IClientSetMonitoringBaseRequestHandler handler;

    public SetMonitoringBaseFeature(IClientSetMonitoringBaseRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleSetMonitoringBaseRequest((SetMonitoringBaseRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return SetMonitoringBaseRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return SetMonitoringBaseResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.SET_MONITORING_BASE.value();
    }
}
