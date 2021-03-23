package com.polmon.polsoft.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Template.
 */
@Entity
@Table(name = "template")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "template")
public class Template extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(name = "template_name", nullable = false)
    private String templateName;

    @Column(name = "thresholds")
    private String thresholds;

    @Column(name = "sms")
    private String sms;

    @Column(name = "emails")
    private String emails;

    @NotNull
    @Column(name = "acknowledge_with_comment", nullable = false)
    private Boolean acknowledgeWithComment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTemplateName() {
        return templateName;
    }

    public Template templateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getThresholds() {
        return thresholds;
    }

    public Template thresholds(String thresholds) {
        this.thresholds = thresholds;
        return this;
    }

    public void setThresholds(String thresholds) {
        this.thresholds = thresholds;
    }

    public String getSms() {
        return sms;
    }

    public Template sms(String sms) {
        this.sms = sms;
        return this;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getEmails() {
        return emails;
    }

    public Template emails(String emails) {
        this.emails = emails;
        return this;
    }

    public void setEmails(String emails) {
        this.emails = emails;
    }

    public Boolean isAcknowledgeWithComment() {
        return acknowledgeWithComment;
    }

    public Template acknowledgeWithComment(Boolean acknowledgeWithComment) {
        this.acknowledgeWithComment = acknowledgeWithComment;
        return this;
    }

    public void setAcknowledgeWithComment(Boolean acknowledgeWithComment) {
        this.acknowledgeWithComment = acknowledgeWithComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Template template = (Template) o;
        if(template.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, template.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Template{" +
            "id=" + id +
            ", templateName='" + templateName + "'" +
            ", thresholds='" + thresholds + "'" +
            ", sms='" + sms + "'" +
            ", emails='" + emails + "'" +
            ", acknowledgeWithComment='" + acknowledgeWithComment + "'" +
            '}';
    }
}
