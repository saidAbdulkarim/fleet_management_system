package fleet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {
	@GetMapping("/vehicleModel")
	public String getEmployees() {
		return "vehicleModel";
	}
}
