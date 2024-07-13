package com.thinkconstructive.db_demo;

import com.thinkconstructive.db_demo.entity.StoreInformation;
import com.thinkconstructive.db_demo.repository.StoreInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  DbDemoApplication implements CommandLineRunner {

	@Autowired
	StoreInformationRepository storeInformationRepository;

	public static void main(String[] args) {
		SpringApplication.run(DbDemoApplication.class, args);
	}
	@Override
	public void run(String... args){
		StoreInformation storeInformationOne =  new StoreInformation("Amazon",
				"Here are details for Amazon", "xxxx");
       storeInformationRepository.save(storeInformationOne);
		StoreInformation storeInformationTwo =  new StoreInformation("Flipkart",
				"Here are details for Flipkart", "yyyy");
		storeInformationRepository.save(storeInformationTwo);
		StoreInformation storeInformationThree =  new StoreInformation("Meshoo",
				"Here are details for ...", "zzzz");
		storeInformationRepository.save(storeInformationThree);
		StoreInformation storeInformationFour =  new StoreInformation("Myntra",
				"Here are details for ...", "aaaa");
		storeInformationRepository.save(storeInformationFour);

	   storeInformationRepository.findByStoreName("Amazon").forEach(
			   val -> System.out.println(val)
	   );

	   storeInformationRepository.findByStoreDetail("Here are details for ...").forEach(
				val -> System.out.println(val)
	   );

	   storeInformationRepository.findByStorePhoneNumber("yyyy").forEach(
				val -> System.out.println(val)
	   );
		storeInformationRepository.findById(2).ifPresent(
				val -> System.out.println(val)
		);

		System.out.println(storeInformationRepository.count());
		storeInformationRepository.deleteById(2);
		System.out.println(storeInformationRepository.count());
	}

}
