package com.polmon.polsoft.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Systempreferences.
 */
@Entity
@Table(name = "systempreferences")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "systempreferences")
public class Systempreferences extends AbstractAuditingEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "data")
    private String data;

    @Column(name = "keyproperty")
    private String keyproperty;

    @Column(name = "type")
    private boolean type;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public Systempreferences data(String data) {
        this.data = data;
        return this;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getKeyproperty() {
        return keyproperty;
    }

    public Systempreferences keyproperty(String keyproperty) {
        this.keyproperty = keyproperty;
        return this;
    }

    public void setKeyproperty(String keyproperty) {
        this.keyproperty = keyproperty;
    }

    public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
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
        Systempreferences systempreferences = (Systempreferences) o;
        if(systempreferences.id == null || id == null) {
            return false;
        }
        return Objects.equals(id, systempreferences.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Systempreferences{" +
            "id=" + id +
            ", data='" + data + "'" +
            ", keyproperty='" + keyproperty + "'" +
            ", type= '" + type + "'" +
            '}';
    }
}
