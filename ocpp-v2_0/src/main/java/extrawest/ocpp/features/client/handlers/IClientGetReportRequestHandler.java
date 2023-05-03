package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.GetReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetReportResponse;

/** Charging Station handler of {@link GetReportRequest} */
public interface IClientGetReportRequestHandler {
    GetReportResponse handleGetReportRequest(GetReportRequest request);
}
