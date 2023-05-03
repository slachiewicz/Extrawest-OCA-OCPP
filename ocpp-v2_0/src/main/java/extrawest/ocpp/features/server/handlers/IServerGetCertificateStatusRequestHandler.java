package extrawest.ocpp.features.server.handlers;

import com.extrawest.ocpp_2_0_1.model.request.GetCertificateStatusRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetCertificateStatusResponse;

import java.util.UUID;

/** Central system handler of {@link GetCertificateStatusRequest}s. */
public interface IServerGetCertificateStatusRequestHandler {
    GetCertificateStatusResponse handleGetCertificateStatusRequest(
            UUID sessionIndex, GetCertificateStatusRequest request);
}
