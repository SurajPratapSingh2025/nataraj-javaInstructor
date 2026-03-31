package com.mainapp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mainapp.service.OneToManyAssociationMgmtServiceImpl;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	
	@Autowired
	private OneToManyAssociationMgmtServiceImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		
		try {

			//saving data using parent
//			PlayerEntity player = new PlayerEntity(new Random().nextInt(100000),"virat","delhi",35);
//			SportEntity sport = new SportEntity(new Random().nextInt(100000),"cricket","outdoor",new String[]{"bat","ball","pads","helmet"}) ;
//			MedalEntity medal = new MedalEntity(new Random().nextInt(100000),"gold","world cup","india");
//			//add child to the parent
//			player.setSportsInfo(Set.of(sport));
//			player.setMedalsInfo(Map.of(UUID.randomUUID().toString(),medal));
//			//use service
//			System.out.println(service.saveDataUsingPlayer(player));
			
			//saving data using child => it happen in many to one
			
			
			
			
			
			
			
			
			
			//show data using parent
			service.showDataUsingPlayer().forEach(player -> {

			    System.out.println("parent: " + player);

			    System.out.println("Sports:");
			    player.getSportsInfo().forEach(System.out::println);

			    System.out.println("Medals:");
			    player.getMedalsInfo().forEach((key, value) -> 
			        System.out.println("Key: " + key + ", Value: " + value)
			    );
			});
//			//show data using child => it happens in many to one
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
