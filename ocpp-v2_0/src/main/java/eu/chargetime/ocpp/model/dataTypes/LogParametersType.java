package eu.chargetime.ocpp.model.dataTypes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import eu.chargetime.ocpp.model.Validatable;
import eu.chargetime.ocpp.model.validation.OCPP2PrimDatatypes;
import eu.chargetime.ocpp.model.validation.Validator;
import eu.chargetime.ocpp.model.validation.ValidatorBuilder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;


/**
 * Log
 * urn:x-enexis:ecdm:uid:2:233373
 * Generic class for the configuration of logging entries.
 *
 *
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customData",
        "remoteLocation",
        "oldestTimestamp",
        "latestTimestamp"
})
@Getter
@EqualsAndHashCode
@ToString
public class LogParametersType implements Validatable {

    private transient Validator remoteLocationValidator =
            new ValidatorBuilder()
                    .setRequired(true)
                    .addRule(OCPP2PrimDatatypes.string512())
                    .build();

    /**
     * This class does not get 'AdditionalProperties = false' in the schema generation, so it can be extended with arbitrary JSON properties to allow adding custom data.
     *
     */
    @JsonProperty("customData")
    public CustomDataType customData;
    /**
     * Log. Remote_ Location. URI
     * urn:x-enexis:ecdm:uid:1:569484
     * The URL of the location at the remote system where the log should be stored.
     *
     * (Required)
     *
     */
    @JsonProperty("remoteLocation")
    public String remoteLocation;
    /**
     * Log. Oldest_ Timestamp. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569477
     * This contains the date and time of the oldest logging information to include in the diagnostics.
     *
     *
     */
    @JsonProperty("oldestTimestamp")
    public Date oldestTimestamp;
    /**
     * Log. Latest_ Timestamp. Date_ Time
     * urn:x-enexis:ecdm:uid:1:569482
     * This contains the date and time of the latest logging information to include in the diagnostics.
     *
     *
     */
    @JsonProperty("latestTimestamp")
    public Date latestTimestamp;

    public LogParametersType(String remoteLocation) {
        remoteLocationValidator.validate(remoteLocation);
        this.remoteLocation = remoteLocation;
    }

    public void setCustomData(CustomDataType customData) {
        this.customData = customData;
    }

    public void setRemoteLocation(String remoteLocation) {
        remoteLocationValidator.validate(remoteLocation);
        this.remoteLocation = remoteLocation;
    }

    public void setOldestTimestamp(Date oldestTimestamp) {
        this.oldestTimestamp = oldestTimestamp;
    }

    public void setLatestTimestamp(Date latestTimestamp) {
        this.latestTimestamp = latestTimestamp;
    }

    @Override
    public boolean validate() {
        return remoteLocationValidator.safeValidate(remoteLocation);
    }
}
