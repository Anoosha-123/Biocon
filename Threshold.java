package com.polmon.polsoft.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Threshold.
 */
@Entity
@Table(name = "threshold")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "threshold")
public class Threshold implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "threshold_name", nullable = false)
    private String thresholdName;

    @NotNull
    @Column(name = "parameter", nullable = false)
    private String parameter;

    @NotNull
    @Column(name = "value", nullable = false)
    private Double value;

    @NotNull
    @Column(name = "severity", nullable = false)
    private String severity;

    @NotNull
    @Column(name = "lower_limit_alarm", nullable = false)
    private Float lowerLimitAlarm;

    @NotNull
    @Column(name = "upper_limit_alarm", nullable = false)
    private Float upperLimitAlarm;

    @NotNull
    @Column(name = "lower_limit_warning", nullable = false)
    private Float lowerLimitWarning;

    @NotNull
    @Column(name = "upper_limit_warning", nullable = false)
    private Float upperLimitWarning;

    @NotNull
    @Column(name = "warning_enabled", nullable = false)
    private Boolean warningEnabled;

    @NotNull
    @Column(name = "alarm_enabled", nullable = false)
    private Boolean alarmEnabled;

    @NotNull
    @Column(name = "warning_hysteresis", nullable = false)
    private Float warningHysteresis;

    @NotNull
    @Column(name = "alarm_hysteresis", nullable = false)
    private Float alarmHysteresis;

    @NotNull
    @Column(name = "alarm_delay", nullable = false)
    private Float alarmDelay;

    @Column(name = "warning_delay")
    private Float warningDelay;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getThresholdName() {
        return thresholdName;
    }

    public Threshold thresholdName(String thresholdName) {
        this.thresholdName = thresholdName;
        return this;
    }

    public void setThresholdName(String thresholdName) {
        this.thresholdName = thresholdName;
    }

    public String getParameter() {
        return parameter;
    }

    public Threshold parameter(String parameter) {
        this.parameter = parameter;
        return this;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public Double getValue() {
        return value;
    }

    public Threshold value(Double value) {
        this.value = value;
        return this;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getSeverity() {
        return severity;
    }

    public Threshold severity(String severity) {
        this.severity = severity;
        return this;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Float getLowerLimitAlarm() {
        return lowerLimitAlarm;
    }

    public Threshold lowerLimitAlarm(Float lowerLimitAlarm) {
        this.lowerLimitAlarm = lowerLimitAlarm;
        return this;
    }

    public void setLowerLimitAlarm(Float lowerLimitAlarm) {
        this.lowerLimitAlarm = lowerLimitAlarm;
    }

    public Float getUpperLimitAlarm() {
        return upperLimitAlarm;
    }

    public Threshold upperLimitAlarm(Float upperLimitAlarm) {
        this.upperLimitAlarm = upperLimitAlarm;
        return this;
    }

    public void setUpperLimitAlarm(Float upperLimitAlarm) {
        this.upperLimitAlarm = upperLimitAlarm;
    }

    public Float getLowerLimitWarning() {
        return lowerLimitWarning;
    }

    public Threshold lowerLimitWarning(Float lowerLimitWarning) {
        this.lowerLimitWarning = lowerLimitWarning;
        return this;
    }

    public void setLowerLimitWarning(Float lowerLimitWarning) {
        this.lowerLimitWarning = lowerLimitWarning;
    }

    public Float getUpperLimitWarning() {
        return upperLimitWarning;
    }

    public Threshold upperLimitWarning(Float upperLimitWarning) {
        this.upperLimitWarning = upperLimitWarning;
        return this;
    }

    public void setUpperLimitWarning(Float upperLimitWarning) {
        this.upperLimitWarning = upperLimitWarning;
    }

    public Boolean isWarningEnabled() {
        return warningEnabled;
    }

    public Threshold warningEnabled(Boolean warningEnabled) {
        this.warningEnabled = warningEnabled;
        return this;
    }

    public void setWarningEnabled(Boolean warningEnabled) {
        this.warningEnabled = warningEnabled;
    }

    public Boolean isAlarmEnabled() {
        return alarmEnabled;
    }

    public Threshold alarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
        return this;
    }

    public void setAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
    }

    public Float getWarningHysteresis() {
        return warningHysteresis;
    }

    public Threshold warningHysteresis(Float warningHysteresis) {
        this.warningHysteresis = warningHysteresis;
        return this;
    }

    public void setWarningHysteresis(Float warningHysteresis) {
        this.warningHysteresis = warningHysteresis;
    }

    public Float getAlarmHysteresis() {
        return alarmHysteresis;
    }

    public Threshold alarmHysteresis(Float alarmHysteresis) {
        this.alarmHysteresis = alarmHysteresis;
        return this;
    }

    public void setAlarmHysteresis(Float alarmHysteresis) {
        this.alarmHysteresis = alarmHysteresis;
    }

    public Float getAlarmDelay() {
        return alarmDelay;
    }

    public Threshold alarmDelay(Float alarmDelay) {
        this.alarmDelay = alarmDelay;
        return this;
    }

    public void setAlarmDelay(Float alarmDelay) {
        this.alarmDelay = alarmDelay;
    }

    public Float getWarningDelay() {
        return warningDelay;
    }

    public Threshold warningDelay(Float warningDelay) {
        this.warningDelay = warningDelay;
        return this;
    }

    public void setWarningDelay(Float warningDelay) {
        this.warningDelay = warningDelay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Threshold threshold = (Threshold) o;
        if(threshold.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, threshold.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Threshold{" +
            "id=" + id +
            ", thresholdName='" + thresholdName + "'" +
            ", parameter='" + parameter + "'" +
            ", value='" + value + "'" +
            ", severity='" + severity + "'" +
            ", lowerLimitAlarm='" + lowerLimitAlarm + "'" +
            ", upperLimitAlarm='" + upperLimitAlarm + "'" +
            ", lowerLimitWarning='" + lowerLimitWarning + "'" +
            ", upperLimitWarning='" + upperLimitWarning + "'" +
            ", warningEnabled='" + warningEnabled + "'" +
            ", alarmEnabled='" + alarmEnabled + "'" +
            ", warningHysteresis='" + warningHysteresis + "'" +
            ", alarmHysteresis='" + alarmHysteresis + "'" +
            ", alarmDelay='" + alarmDelay + "'" +
            ", warningDelay='" + warningDelay + "'" +
            '}';
    }
}
