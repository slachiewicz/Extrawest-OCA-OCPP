package extrawest.ocpp.features.client;

import com.extrawest.ocpp_2_0_1.constants.FeatureConstants;
import com.extrawest.common.feature.Feature;
import com.extrawest.ocpp_2_0_1.features.client.handlers.IClientGetInstalledCertificateIdsRequestHandler;
import com.extrawest.common.model.Confirmation;
import com.extrawest.common.model.Request;
import com.extrawest.ocpp_2_0_1.model.request.GetInstalledCertificateIdsRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetInstalledCertificateIdsResponse;

import java.util.UUID;

public class GetInstalledCertificateIdsFeature implements Feature {
    private final IClientGetInstalledCertificateIdsRequestHandler handler;

    public GetInstalledCertificateIdsFeature(IClientGetInstalledCertificateIdsRequestHandler handler) {
        this.handler = handler;
    }

    @Override
    public Confirmation handleRequest(UUID sessionIndex, Request request) {
        return handler.handleGetInstalledCertificateIdsRequest((GetInstalledCertificateIdsRequest) request);
    }

    @Override
    public Class<? extends Request> getRequestType() {
        return GetInstalledCertificateIdsRequest.class;
    }

    @Override
    public Class<? extends Confirmation> getConfirmationType() {
        return GetInstalledCertificateIdsResponse.class;
    }

    @Override
    public String getAction() {
        return FeatureConstants.GET_INSTALLED_CERTIFICATE_IDS.value();
    }
}
