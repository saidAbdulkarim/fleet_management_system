package fleet.model;

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
public class Client {
   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FMS_generator")
	@SequenceGenerator(name = "FMS_generator", sequenceName = "FMS_SEQ", allocationSize = 1)
	private int id;
	
	private String name;
	private String address;
	private String city;
	private String phone;
	private String mobile;
	private String website;
	private String email;
	@ManyToOne
	@JoinColumn(name = "countryId", insertable = false,updatable = false)
	private Country country;
	private Integer countryId;
	@ManyToOne
	@JoinColumn(name = "stateId", insertable = false,updatable = false)
	private State state;
	private Integer stateId;
	
	
	private String details;
}
