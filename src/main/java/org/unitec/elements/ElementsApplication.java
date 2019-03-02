package org.unitec.elements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementsApplication implements CommandLineRunner{
    
    @Autowired
    RepoUser repoU;

	public static void main(String[] args) {
		SpringApplication.run(ElementsApplication.class, args);
	}
    @Override
    public void run(String... args) throws Exception {
        //all test and we don't need the UI
        repoU.save(new User(2, "Alexandra"));
        //repoU.deleteById(2);
        //User u = new User();
        //u.setId(4);
        //u.setName("Karen");
        //repoU.save(u);
        //fo
         //  System.out.println(u);
        //}//); //System.out.println(repoU.findById(2).get());
        
        //for(User u:repoU.findbyName1("Vivizz")){
         // System.out.println(u);
       //}
    }
}

