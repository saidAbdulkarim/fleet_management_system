package fleet.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;




@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class CommonObject extends Auditable<String> {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FMS_generator")
	@SequenceGenerator(name = "FMS_generator", sequenceName = "FMS_SEQ", allocationSize = 1)
	protected Integer id;
	private String description;
	private String details;

	
}
