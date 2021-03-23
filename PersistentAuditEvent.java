package com.polmon.polsoft.domain;

import java.time.LocalDateTime;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.Map;

/**
 * Persist AuditEvent managed by the Spring Boot actuator
 * 
 * @see org.springframework.boot.actuate.audit.AuditEvent
 */
@Entity
@Table(name = "jhi_persistent_audit_event")
public class PersistentAuditEvent {

	public static HashMap maping = new HashMap();

	static {
		maping.put("Location", "Location");
		maping.put("Dchannel", "Channel");
		maping.put("Device", "Device");
		maping.put("Logindata", "Login");
		maping.put("ChannelAlarm", "Alarm");
	}
	
	@Id
	/*@GeneratedValue(strategy = GenerationType.AUTO)*/
	@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_JUST_FOR_AUDIT", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
	@Column(name = "event_id")
	private Long id;

	   @Lob
	    @Column(name = "entity_value")
	    private String entityValue;

	
	@NotNull
	@Column(nullable = false)
	private String principal;

	@Column(name = "event_date")
	private LocalDateTime auditEventDate;
	
	@Column(name = "event_type")
	private String auditEventType;

	@Column(name = "entity_id")
	private Long entityId;
	
	@Column(name = "event_source")
	private String auditEventSource;
	
	@Column(name = "commit_version")
	private Integer commitVersion;
	
	
	@Column(name = "reviewed_by")
	private String reviewedBy;
	
	@ElementCollection
	@MapKeyColumn(name = "name")
	@Column(name = "value")
	@CollectionTable(name = "jhi_persistent_audit_evt_data", joinColumns = @JoinColumn(name = "event_id"))
	private Map<String, String> data = new HashMap<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrincipal() {
		return principal;
	}

	public void setPrincipal(String principal) {
		this.principal = principal;
	}

	public LocalDateTime getAuditEventDate() {
		return auditEventDate;
	}

	public void setAuditEventDate(LocalDateTime auditEventDate) {
		this.auditEventDate = auditEventDate;
	}

	public String getAuditEventType() {
		return auditEventType;
	}

	public void setAuditEventType(String auditEventType) {
		this.auditEventType = maping.get(auditEventType) != null ? maping.get(auditEventType).toString() : auditEventType;
	}

	public Map<String, String> getData() {
		return data;
	}

	public void setData(Map<String, String> data) {
		this.data = data;
	}

	public void setAuditEventType(String value, String simpleName) {
		this.setAuditEventType(value + " " + (maping.get(simpleName) != null ? maping.get(simpleName) : simpleName));
	}

	public String getAuditEventSource() {
		return auditEventSource;
	}

	public void setAuditEventSource(String auditEventSource) {
		this.auditEventSource = auditEventSource;
	}

	public Integer getCommitVersion() {
		return commitVersion;
	}

	public void setCommitVersion(Integer commitVersion) {
		this.commitVersion = commitVersion;
	}

	public String getReviewedBy() {
		return reviewedBy;
	}

	public void setReviewedBy(String reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

	public Long getEntityId() {
		return entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public String getEntityValue() {
		return entityValue;
	}

	public void setEntityValue(String entityValue) {
		this.entityValue = entityValue;
	}
}
