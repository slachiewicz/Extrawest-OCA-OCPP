package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientSetMonitoringLevelRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.SetMonitoringLevelRequest;
import com.extrawest.ocpp_2_0_1.model.response.SetMonitoringLevelResponse;

import java.util.UUID;

public class SetMonitoringLevelFeature implements Feature {
    private final IClientSetMonitoringLevelRequestHandler handler;

    public SetMonitoringLevelFeature(IClientSetMonitoringLevelRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleSetMonitoringLevelRequest((SetMonitoringLevelRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return SetMonitoringLevelRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return SetMonitoringLevelResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.SET_MONITORING_LEVEL.value();
    }
}
