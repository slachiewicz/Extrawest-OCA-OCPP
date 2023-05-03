package com.extrawest.ocpp_2_0_1.model.request;

import com.extrawest.common.model.RequestWithId;
import com.extrawest.common.model.validation.RequiredValidator;
import com.extrawest.common.model.validation.Validator;
import com.extrawest.ocpp_2_0_1.model.dataTypes.ComponentVariableType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CustomDataType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.MonitoringCriterionEnumType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "componentVariable",
        "requestId",
        "monitoringCriteria"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class GetMonitoringReportRequest extends RequestWithId {

    private final transient Validator<Object> requiredValidator = new RequiredValidator();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;

    @JsonProperty("componentVariable")
    public List<ComponentVariableType> componentVariable;
    /**
     * The Id of the request.
     *
     * (Required)
     *
     */
    @JsonProperty("requestId")
    public Integer requestId;
    /**
     * This field contains criteria for components for which a monitoring report is requested
     *
     *
     */
    @JsonProperty("monitoringCriteria")
    public List<MonitoringCriterionEnumType> monitoringCriteria;

    public GetMonitoringReportRequest(Integer requestId) {
        requiredValidator.validate(requestId);
        this.requestId = requestId;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setComponentVariable(List<ComponentVariableType> componentVariable) {
        this.componentVariable = componentVariable;
    }

    public void setRequestId(Integer requestId) {
        requiredValidator.validate(requestId);
        this.requestId = requestId;
    }

    public void setMonitoringCriteria(List<MonitoringCriterionEnumType> monitoringCriteria) {
        this.monitoringCriteria = monitoringCriteria;
    }

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return requiredValidator.safeValidate(requestId);
    }
}
