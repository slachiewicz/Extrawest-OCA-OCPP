package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.GetInstalledCertificateIdsRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetInstalledCertificateIdsResponse;

/** Charging Station handler of {@link GetInstalledCertificateIdsRequest} */
public interface IClientGetInstalledCertificateIdsRequestHandler {
    GetInstalledCertificateIdsResponse handleGetInstalledCertificateIdsRequest(GetInstalledCertificateIdsRequest request);
}
