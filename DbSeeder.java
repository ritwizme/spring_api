package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {
	private MachineRepository machineRepository;
	
	public DbSeeder(MachineRepository machineRepository) {
		this.machineRepository=machineRepository;
	}
	
	
	@Override
	public void run(String...string) throws Exception{
		Machines bulldozer = new Machines(
					"Bulldozer",
					 5000,
					"Heavy Machinery",
					"TATA",
					200,
					Arrays.asList(
							new Tags("Heavy Machinery"),
							new Tags("Bulldozer"),
							new Tags("crawler")
							)
					
				);
		Machines snowcat = new Machines(
				"Snowcat",
				 4000,
				"Heavy Machinery",
				"Hitachi",
				100,
				Arrays.asList(
						new Tags("Heavy Machinery"),
						new Tags("Snowcat"),
						new Tags("crawler")
						)
				
			);
		Machines tractor = new Machines(
				"Tractor",
				 1000,
				"Heavy Machinery",
				"Mahindra",
				50,
				Arrays.asList(
						new Tags("Heavy Machinery"),
						new Tags("tractor"),
						new Tags("farm")
						)
				
			);
		Machines crane = new Machines(
				"Crane",
				 100,
				"Heavy Machinery",
				"Hitachi",
				10,
				Arrays.asList(
						new Tags("Heavy Machinery"),
						new Tags("Crane"),
						new Tags("Lifting machine")
						)
				
			);

		//drop all hotel
		this.machineRepository.deleteAll();
		List<Machines> machines = Arrays.asList(bulldozer, snowcat, tractor, crane);
		this.machineRepository.saveAll(machines);

	}
	
}
