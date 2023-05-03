package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerGet15118EVCertificateRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.Iso15118EVCertificateStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.Get15118EVCertificateRequest;
import com.extrawest.ocpp_2_0_1.model.response.Get15118EVCertificateResponse;

import java.util.UUID;

public class ServerGet15118EVCertificateRequestHandler implements IServerGet15118EVCertificateRequestHandler {
    @Override
    public Get15118EVCertificateResponse handleGet15118EVCertificateRequest(UUID sessionIndex, Get15118EVCertificateRequest request) {
        return new Get15118EVCertificateResponse(Iso15118EVCertificateStatusEnumType.ACCEPTED, "200");
    }
}
