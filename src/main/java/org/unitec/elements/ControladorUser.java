/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.elements;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author brand
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ControladorUser {

    @Autowired
    RepoUser repoUser;
    //1 save user save()

    @PostMapping("/user")
    Status save(@RequestBody String json) throws Exception {
        ObjectMapper maper = new ObjectMapper();
        User u = maper.readValue(json, User.class);
        repoUser.save(u);
        Status s = new Status("Saved user", true);
        return s;
    }

    @GetMapping("/user")
    List<User> searchAll() {
        return repoUser.findAll();
    }
    //search by id

    @GetMapping("/user/{id}")
    User searchById(@PathVariable Integer id) {
        return repoUser.findById(id).get();
    }

    //update
    @PutMapping("/user")
    Status actulization(@RequestBody String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        User u = mapper.readValue(json, User.class);
        repoUser.save(u);
        Status s = new Status("Updated user", true);
        return s;
    }
    
    //Delete
    @DeleteMapping("/user/{id}")
    Status delete(@PathVariable Integer id){
    repoUser.deleteById(id);
    Status s = new Status("Erase user", true);
    return s;
    }
}
