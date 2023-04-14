package eu.chargetime.ocpp.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import eu.chargetime.ocpp.model.RequestWithId;
import eu.chargetime.ocpp.model.dataTypes.ComponentVariableType;
import eu.chargetime.ocpp.model.dataTypes.CustomDataType;
import eu.chargetime.ocpp.model.dataTypes.enums.ComponentCriterionEnumType;
import eu.chargetime.ocpp.model.validation.RequiredValidator;
import eu.chargetime.ocpp.model.validation.Validator;
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
        "componentCriteria"
})
@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class GetReportRequest extends RequestWithId {

    private transient Validator<Object> requiredValidator = new RequiredValidator();

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
     * This field contains criteria for components for which a report is requested
     *
     *
     */
    @JsonProperty("componentCriteria")
    public List<ComponentCriterionEnumType> componentCriteria;

    public GetReportRequest(Integer requestId) {
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

    public void setComponentCriteria(List<ComponentCriterionEnumType> componentCriteria) {
        this.componentCriteria = componentCriteria;
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
