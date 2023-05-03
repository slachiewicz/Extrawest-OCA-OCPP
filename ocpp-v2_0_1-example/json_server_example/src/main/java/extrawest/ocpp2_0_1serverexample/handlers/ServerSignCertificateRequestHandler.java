package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerSignCertificateRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GenericStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.SignCertificateRequest;
import com.extrawest.ocpp_2_0_1.model.response.SignCertificateResponse;

import java.util.UUID;

public class ServerSignCertificateRequestHandler implements IServerSignCertificateRequestHandler {
    @Override
    public SignCertificateResponse handleSignCertificateRequest(UUID sessionIndex, SignCertificateRequest request) {
        return new SignCertificateResponse(GenericStatusEnumType.ACCEPTED);
    }
}
