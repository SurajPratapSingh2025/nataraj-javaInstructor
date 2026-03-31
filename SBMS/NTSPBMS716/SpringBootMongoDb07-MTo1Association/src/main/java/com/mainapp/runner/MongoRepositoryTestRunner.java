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

			//saving data using parent	=> one to many
//			PlayerEntity player = new PlayerEntity(new Random().nextInt(100000),"virat","delhi",35);
//			SportEntity sport = new SportEntity(new Random().nextInt(100000),"cricket","outdoor",new String[]{"bat","ball","pads","helmet"}) ;
//			MedalEntity medal = new MedalEntity(new Random().nextInt(100000),"gold","world cup","india");
//			//add child to the parent
//			player.setSportsInfo(Set.of(sport));
//			player.setMedalsInfo(Map.of(UUID.randomUUID().toString(),medal));
//			//use service
//			System.out.println(service.saveDataUsingPlayer(player));
			
			//saving data using child	many to one
//			PlayerEntity player = new PlayerEntity(new Random().nextInt(100000),"virat","delhi",35);
//			SportEntity sport = new SportEntity(new Random().nextInt(100000),"cricket","outdoor",new String[]{"bat","ball","pads","helmet"}) ;
//			MedalEntity medal = new MedalEntity(new Random().nextInt(100000),"gold","world cup","india");
//			//add parent to the child
//			sport.setPlayerDetails(player);
//			//use service
//			System.out.println(service.saveDataUsingSport(sport));
//			
//			medal.setPlayerDetails(player);
//			//use service
//			System.out.println(service.saveDataUsingMedal(medal));
			
			
			
			//****************************** For Showing Data *****************************
			
			//show data using parent	=> one to many
//			service.showDataUsingPlayer().forEach(player -> {
//
//			    System.out.println("parent: " + player);
//
//			    System.out.println("Sports:");
//			    player.getSportsInfo().forEach(System.out::println);
//
//			    System.out.println("Medals:");
//			    player.getMedalsInfo().forEach((key, value) -> 
//			        System.out.println("Key: " + key + ", Value: " + value)
//			    );
//			});
//			//show data using child		=> many to one
			service.showDataUsingSport().forEach(sport->{
				System.out.println("child: "+sport);
				System.out.println("parent: "+sport.getPlayerDetails());
			});
			
			service.showDataUsingMedal().forEach(medal->{
				System.out.println("child: "+medal);
				System.out.println("parent: "+medal.getPlayerDetails());
			});
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
