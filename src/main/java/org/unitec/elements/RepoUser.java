/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elements;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author brand
 */
public interface RepoUser extends MongoRepository<User, Integer>{
  //List<User> findbyName(String name);
    //public void save(User user);
    
}
