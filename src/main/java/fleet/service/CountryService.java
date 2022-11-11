package fleet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fleet.model.Country;
import fleet.repository.CountryRepository;
@Service
public class CountryService {
	@Autowired
	CountryRepository countryRepository;
	//Return List of country
	public List<Country> getCountries(){
		List<Country> all = countryRepository.findAll();
		return all;
	}
}
