package com.mainapp.runner;

import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mainapp.entity.MedalEntity;
import com.mainapp.entity.PlayerEntity;
import com.mainapp.entity.SportEntity;
import com.mainapp.service.OneToManyAssociationMgmtServiceImpl;

@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	
	@Autowired
	private OneToManyAssociationMgmtServiceImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			/*
			 * MongoDB does NOT support true Many-to-Many like JPA/Hibernate Because: 1) No
			 * joins ❌  2)No bidirectional object graph ❌  3) Leads to infinite recursion (your
			 * current error)
			 */

			//saving data using parent	
			PlayerEntity player = new PlayerEntity(new Random().nextInt(100000),"virat","delhi",35);
			SportEntity sport = new SportEntity(new Random().nextInt(100000),"cricket","outdoor",new String[]{"bat","ball","pads","helmet"}) ;
			MedalEntity medal = new MedalEntity(new Random().nextInt(100000),"gold","world cup","india");
			
			//add child to the parent
			player.setSportsInfo(Set.of(sport));
			player.setMedalsInfo(Map.of(UUID.randomUUID().toString(),medal));
			//use service
			System.out.println(service.saveDataUsingPlayer(player));
			
			//saving data using child	
			//add parent to the child
			sport.setPlayerInfo(Set.of(player));
			sport.setMedalInfo(Map.of(UUID.randomUUID().toString(),medal));
			//use service
			System.out.println(service.saveDataUsingSport(sport));
			
			//saving data using child
			//add parent to the child
			medal.setPlayerInfo(Set.of(player));
			medal.setSportsInfo(Map.of(UUID.randomUUID().toString(),sport));
			//use service
			System.out.println(service.saveDataUsingMedal(medal));
			
			
			
			
			//****************************** For Showing Data *****************************
			
			//show data using parent	
//			service.showDataUsingPlayer().forEach(player -> {
//			    System.out.println("parent: " + player);
//			    System.out.println("Sports:");
//			    player.getSportsInfo().forEach(System.out::println);
//			    System.out.println("Medals:");
//			    player.getMedalsInfo().forEach((key, value) -> 
//			        System.out.println("Key: " + key + ", Value: " + value)
//			    );
//			});
//			//show data using child		
//			service.showDataUsingPlayer().forEach(sport -> {
//							    System.out.println("parent: " + sport);
//							    System.out.println("Sports:");
//							    sport.getSportsInfo().forEach(System.out::println);
//							    System.out.println("Medals:");
//							    sport.getMedalsInfo().forEach((key, value) -> 
//							        System.out.println("Key: " + key + ", Value: " + value)
//							    );
//							});
//			//show data using child	
//			service.showDataUsingPlayer().forEach(medal -> {
//			    System.out.println("parent: " + medal);
//			    System.out.println("Sports:");
//			    medal.getSportsInfo().forEach(System.out::println);
//			    System.out.println("Medals:");
//			    medal.getMedalsInfo().forEach((key, value) -> 
//			        System.out.println("Key: " + key + ", Value: " + value)
//			    );
//			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
