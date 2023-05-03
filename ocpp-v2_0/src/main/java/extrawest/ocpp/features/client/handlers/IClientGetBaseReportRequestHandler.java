package extrawest.ocpp.features.client.handlers;

import com.extrawest.ocpp_2_0_1.model.request.GetBaseReportRequest;
import com.extrawest.ocpp_2_0_1.model.response.GetBaseReportResponse;

/** Charging Station handler of {@link GetBaseReportRequest} */
public interface IClientGetBaseReportRequestHandler {
    GetBaseReportResponse handleGetBaseReportRequest(GetBaseReportRequest request);
}
