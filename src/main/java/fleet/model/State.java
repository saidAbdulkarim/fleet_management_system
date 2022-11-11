package fleet.model;

//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn; 
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FMS_generator")
	@SequenceGenerator(name = "FMS_generator", sequenceName = "FMS_SEQ", allocationSize = 1)
	private Integer id;
	private String name;
	private String code;
	private String capital;
	
	@ManyToOne
	@JoinColumn(name = "countryid", insertable = false, updatable = false)
	private Country country;
	
	private Integer countryid;
	private String details;
}
