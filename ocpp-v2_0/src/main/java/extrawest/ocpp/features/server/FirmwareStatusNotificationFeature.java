package extrawest.ocpp.features.server;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerFirmwareStatusNotificationRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.FirmwareStatusNotificationRequest;
import com.extrawest.ocpp_2_0_1.model.response.FirmwareStatusNotificationResponse;

import java.util.UUID;

public class FirmwareStatusNotificationFeature implements Feature {
    private final IServerFirmwareStatusNotificationRequestHandler handler;

    public FirmwareStatusNotificationFeature(IServerFirmwareStatusNotificationRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleFirmwareStatusNotification(sessionIndex, (FirmwareStatusNotificationRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return FirmwareStatusNotificationRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return FirmwareStatusNotificationResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.FIRMWARE_STATUS_NOTIFICATION.value();
    }
}
