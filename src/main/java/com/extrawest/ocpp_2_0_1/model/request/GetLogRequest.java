package com.extrawest.ocpp_2_0_1.model.request;

import com.extrawest.common.model.RequestWithId;
import com.extrawest.common.model.validation.RequiredValidator;
import com.extrawest.common.model.validation.Validator;
import com.extrawest.ocpp_2_0_1.model.dataTypes.CustomDataType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.LogParametersType;
import com.extrawest.ocpp_2_0_1.model.dataTypes.enums.LogEnumType;
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
        "log",
        "logType",
        "requestId",
        "retries",
        "retryInterval"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class GetLogRequest extends RequestWithId {

    private final transient Validator<Object> requiredValidator = new RequiredValidator();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     * Log
     * urn:x-enexis:ecdm:uid:2:233373
     * Generic class for the configuration of logging entries.
     *
     * (Required)
     *
     */
    @JsonProperty("log")
    public LogParametersType log;
    /**
     * This contains the type of log file that the Charging Station
     * should send.
     *
     * (Required)
     *
     */
    @JsonProperty("logType")
    public LogEnumType logType;
    /**
     * The Id of this request
     *
     * (Required)
     *
     */
    @JsonProperty("requestId")
    public Integer requestId;
    /**
     * This specifies how many times the Charging Station must try to upload the log before giving up. If this field is not present, it is left to Charging Station to decide how many times it wants to retry.
     *
     *
     */
    @JsonProperty("retries")
    public Integer retries;
    /**
     * The interval in seconds after which a retry may be attempted. If this field is not present, it is left to Charging Station to decide how long to wait between attempts.
     *
     *
     */
    @JsonProperty("retryInterval")
    public Integer retryInterval;

    public GetLogRequest(LogParametersType log, LogEnumType logType, Integer requestId) {
        requiredValidator.validate(log);
        requiredValidator.validate(logType);
        requiredValidator.validate(requestId);
        this.log = log;
        this.logType = logType;
        this.requestId = requestId;
    }

    public void setLog(LogParametersType log) {
        requiredValidator.validate(log);
        this.log = log;
    }

    public void setLogType(LogEnumType logType) {
        requiredValidator.validate(logType);
        this.logType = logType;
    }

    public void setRequestId(Integer requestId) {
        requiredValidator.validate(requestId);
        this.requestId = requestId;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    @Override
    public boolean transactionRelated() {
        return false;
    }

    @Override
    public boolean validate() {
        return requiredValidator.safeValidate(log)
                &&requiredValidator.safeValidate(logType)
                &&requiredValidator.safeValidate(requestId);
    }
}
