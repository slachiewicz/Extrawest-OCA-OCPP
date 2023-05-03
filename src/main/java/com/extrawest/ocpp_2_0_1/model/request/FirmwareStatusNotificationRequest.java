package com.extrawest.ocpp_2_0_1.model.request;

import com.extrawest.common.model.RequestWithId;
import com.extrawest.common.model.validation.RequiredValidator;
import com.extrawest.common.model.validation.Validator;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CustomDataType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.FirmwareStatusEnumType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "status",
        "requestId"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class FirmwareStatusNotificationRequest extends RequestWithId {

    private final transient Validator<Object> requiredValidator = new RequiredValidator();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     * This contains the progress status of the firmware installation.
     *
     * (Required)
     *
     */
    @JsonProperty("status")
    public FirmwareStatusEnumType status;
    /**
     * The request id that was provided in the
     * UpdateFirmwareRequest that started this firmware update.
     * This field is mandatory, unless the message was triggered by a TriggerMessageRequest AND there is no firmware update ongoing.
     *
     *
     */
    @JsonProperty("requestId")
    public Integer requestId;

    public FirmwareStatusNotificationRequest(FirmwareStatusEnumType status) {
        requiredValidator.validate(status);
        this.status = status;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setStatus(FirmwareStatusEnumType status) {
        requiredValidator.validate(status);
        this.status = status;
    }

    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return requiredValidator.safeValidate(status);
    }
}
