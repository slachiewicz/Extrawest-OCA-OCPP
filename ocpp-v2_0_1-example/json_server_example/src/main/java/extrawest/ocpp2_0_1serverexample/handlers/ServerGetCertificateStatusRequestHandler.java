package extrawest.ocpp2_0_1serverexample.handlers;

import com.extrawest.ocpp_2_0_1.features.server.handlers.IServerGetCertificateStatusRequestHandler;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.GetCertificateStatusEnumType;
import com.extrawest.ocpp_2_0_1.model.request.GetCertificateStatusRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetCertificateStatusResponse;

import java.util.UUID;

public class ServerGetCertificateStatusRequestHandler implements IServerGetCertificateStatusRequestHandler {
    @Override
    public GetCertificateStatusResponse handleGetCertificateStatusRequest(UUID sessionIndex, GetCertificateStatusRequest request) {
        return new GetCertificateStatusResponse(GetCertificateStatusEnumType.ACCEPTED);
    }
}
