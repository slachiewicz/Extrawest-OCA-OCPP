package com.extrawest.ocpp_2_0_1.model.request;

import com.extrawest.common.model.RequestWithId;
import com.extrawest.common.model.validation.RequiredValidator;
import com.extrawest.common.model.validation.Validator;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CustomDataType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.SetMonitoringDataType;
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
        "setMonitoringData"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class SetVariableMonitoringRequest extends RequestWithId {

    private final transient Validator<Object> requiredValidator = new RequiredValidator();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     *
     * (Required)
     *
     */
    @JsonProperty("setMonitoringData")
    public List<SetMonitoringDataType> setMonitoringData;

    public SetVariableMonitoringRequest(List<SetMonitoringDataType> setMonitoringData) {
        requiredValidator.validate(setMonitoringData);
        this.setMonitoringData = setMonitoringData;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setSetMonitoringData(List<SetMonitoringDataType> setMonitoringData) {
        requiredValidator.validate(setMonitoringData);
        this.setMonitoringData = setMonitoringData;
    }

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return requiredValidator.safeValidate(setMonitoringData)
                &&setMonitoringData.stream().filter(SetMonitoringDataType::validate).count() == setMonitoringData.size();
    }
}
