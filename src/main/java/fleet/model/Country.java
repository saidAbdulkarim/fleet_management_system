package fleet.model;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Country {
   
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FMS_generator")
	@SequenceGenerator(name = "FMS_generator", sequenceName = "FMS_SEQ", allocationSize = 1)
	private Integer id;
	private String code;
	private String capital;
	private String description;
	private String nationality;
	

	private String continent;
	
	@OneToMany(mappedBy = "country")
	private List<State> states;
}
