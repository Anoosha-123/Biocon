package com.polmon.polsoft.domain;

import java.io.Serializable;
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
@Table(name = "parameterdata")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "parameterdata")
public class ParameterData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_JUST_FOR_PARAMETER_DATA", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_GEN")
    private Long id;
    
    @Column(name = "data")
    private String data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ParameterData pvdata = (ParameterData) o;
        if(pvdata.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, pvdata.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}