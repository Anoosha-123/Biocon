package com.polmon.polsoft.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A ReportTemplate.
 */
@Entity
@Table(name = "report_template")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "reporttemplate")
public class ReportTemplate extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "settings")
    private String settings;
    
    @Column(name="time_frame")
    private String timeFrame;
    
    @Column(name="sampling_data")
    private int samplingData;
    
    @Column(name="users")
    private String users;
    
    @Column(name="duration")
    private int reportDuration;
    
    @Column(name="send_email")
    private Boolean sendEmail;
    
    @Column(name="alarm_limits")
    private Boolean alarmLimits;
    
    @Column(name="minmax")
    private Boolean minMax;
    
    @Column(name="mean")
    private Boolean mean;
    
    @Column(name="stddev")
    private Boolean stdDev;
    
    @Column(name="mkt")
    private Boolean mkt;
    
    @Column(name="fromandtodate")
    private Boolean fromandtoDate;
    
    @Column(name="reportgeneratedtime")
    private Boolean reportgeneratedtime;
    
    @Column(name="username")
    private Boolean username;
    
    @Column(name="owner")
    private String owner;
    
    @Column(name = "type")
    private String type;
    
    @Column(name="include_deviations")
    private String includedeviations;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public ReportTemplate name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSettings() {
        return settings;
    }

    public ReportTemplate settings(String settings) {
        this.settings = settings;
        return this;
    }

    public void setSettings(String settings) {
        this.settings = settings;
    }

    public String getTimeFrame() {
		return timeFrame;
	}

	public void setTimeFrame(String timeFrame) {
		this.timeFrame = timeFrame;
	}

	public int getSamplingData() {
		return samplingData;
	}

	public void setSamplingData(int samplingData) {
		this.samplingData = samplingData;
	}
	
	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

	public int getReportDuration() {
		return reportDuration;
	}

	public void setReportDuration(int reportDuration) {
		this.reportDuration = reportDuration;
	}

	public Boolean getSendEmail() {
		return sendEmail;
	}

	public void setSendEmail(Boolean sendEmail) {
		this.sendEmail = sendEmail;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Boolean getAlarmLimits() {
		return alarmLimits;
	}

	public void setAlarmLimits(Boolean alarmLimits) {
		this.alarmLimits = alarmLimits;
	}

	public Boolean getMean() {
		return mean;
	}

	public void setMean(Boolean mean) {
		this.mean = mean;
	}

	public Boolean getMkt() {
		return mkt;
	}

	public void setMkt(Boolean mkt) {
		this.mkt = mkt;
	}

	public Boolean getReportgeneratedtime() {
		return reportgeneratedtime;
	}

	public void setReportgeneratedtime(Boolean reportgeneratedtime) {
		this.reportgeneratedtime = reportgeneratedtime;
	}

	public Boolean getUsername() {
		return username;
	}

	public void setUsername(Boolean username) {
		this.username = username;
	}

	public Boolean getMinMax() {
		return minMax;
	}

	public void setMinMax(Boolean minMax) {
		this.minMax = minMax;
	}

	public Boolean getStdDev() {
		return stdDev;
	}

	public void setStdDev(Boolean stdDev) {
		this.stdDev = stdDev;
	}

	public Boolean getFromandtoDate() {
		return fromandtoDate;
	}

	public void setFromandtoDate(Boolean fromandtoDate) {
		this.fromandtoDate = fromandtoDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIncludedeviations() {
		return includedeviations;
	}

	public void setIncludedeviations(String includedeviations) {
		this.includedeviations = includedeviations;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportTemplate reportTemplate = (ReportTemplate) o;
        if(reportTemplate.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, reportTemplate.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ReportTemplate{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", settings='" + settings + "', owner = '" +owner+"'"+
            '}';
    }
}