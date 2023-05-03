package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientDataTransferRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.
        com.extrawest.ocpp_2_0_1.model.response.DataTransferResponse;

import java.util.UUID;

public class DataTransferFeature implements Feature {
    private final IClientDataTransferRequestHandler handler;

    public DataTransferFeature(IClientDataTransferRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleCancelDataTransferRequest((DataTransferRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return DataTransferRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return DataTransferResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.DATA_TRANSFER.value();
    }
}
