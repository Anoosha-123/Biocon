package com.polmon.polsoft.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

@Entity
@Table(name = "report")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "report")
public class Report {

	 private static final long serialVersionUID = 1L;

	    @Id
	    @SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_JUST_FOR_REPORT", allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
	    private Long id;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "doneby")
	    private String doneby;
	    
	    @Column(name = "checkedby")
	    private String checkedby;

	    @Column(name = "status")
	    private String status;
	
	    @Column(name="fromdate")
	    private String fromdate;

		  @Column(name="fromdate12")
	    private String fromdate12;
	    
	    @Column(name="todate")
	    private String todate;
	 
	    @Column(name = "settings")
	    private String settings;
	    
	    @Column(name="template")
	    private Long template;
	    
	    @Column(name="doneby_timestamp")
	    private String doneby_timestamp;
	    
	    @Column(name = "checkedby_timestamp")
	    private String checkedby_timestamp;
	    
	    @Column(name = "locations")
	    private String locations;
	    
	    @Column(name = "type")
	    private String type;
	    
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}	
	
		public String getDoneby() {
			return doneby;
		}

		public void setDoneby(String doneby) {
			this.doneby = doneby;
		}

		public String getCheckedby() {
			return checkedby;
		}

		public void setCheckedby(String checkedby) {
			this.checkedby = checkedby;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getFromdate() {
			return fromdate;
		}

		public void setFromdate(String fromdate) {
			this.fromdate = fromdate;
		}

		public String getTodate() {
			return todate;
		}

		public void setTodate(String todate) {
			this.todate = todate;
		}

		public String getSettings() {
			return settings;
		}

		public void setSettings(String settings) {
			this.settings = settings;
		}

		public Long getTemplate() {
			return template;
		}

		public void setTemplate(Long template) {
			this.template = template;
		}

		public String getDoneby_timestamp() {
			return doneby_timestamp;
		}

		public void setDoneby_timestamp(String doneby_timestamp) {
			this.doneby_timestamp = doneby_timestamp;
		}

		public String getCheckedby_timestamp() {
			return checkedby_timestamp;
		}

		public void setCheckedby_timestamp(String checkedby_timestamp) {
			this.checkedby_timestamp = checkedby_timestamp;
		}

		public String getLocations() {
			return locations;
		}

		public void setLocations(String locations) {
			this.locations = locations;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		    public boolean equals(Object o) {
		        if (this == o) {
		            return true;
		        }
		        if (o == null || getClass() != o.getClass()) {
		            return false;
		        }
		        Report device = (Report) o;
		        if(device.id == null || id == null) {
		            return false;
		        }
		        return Objects.equals(id, device.id);
		    }

		    @Override
		    public int hashCode() {
		        return Objects.hashCode(id);
		    }
		    
		    @Override
		    public String toString() {
		        return "ReportDTO{" +
		            "id=" + id +
		            ", name='" + name + "'" +
		            ", doneby='" + doneby + "'" +
		            ", checkedby='" + checkedby + "'" +	
		            ", fromdate='" + fromdate + "'" +
		            ", todate ='" + todate + "'" +
		            ", status ='" + status + "'" +		       
		            '}';
		    }
}
