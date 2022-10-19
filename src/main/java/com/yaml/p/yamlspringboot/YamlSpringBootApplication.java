package com.yaml.p.yamlspringboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import java.util.Random;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import com.yaml.p.yamlspringboot.confige.VaultConfig;


@SpringBootApplication
public class YamlSpringBootApplication 
{
	//  @Autowired
	//  private static UserRepository userRepository;

	// @Autowired
	// private static VaultConfig vaultConfig;

	private static Logger log= LoggerFactory.getLogger(YamlSpringBootApplication.class);
	// public void createUsers(VaultConfigu vaultConfigu)
	// {
		
	// 	User user=new User();
		
	// 	user.setId(vaultConfigu.getId());
	// 	user.setEmail(vaultConfigu.getEmail());
	// 	user.setPassword(vaultConfigu.getPassword());
	// 	user.setEnabled(vaultConfigu.getEnabled());
	// 	user.setRol(vaultConfigu.getRol());
	// 	user.setUsername(vaultConfigu.getUsername());
	// 	User save=userRepository.save(user);

	// 	System.out.println("User Created Right now..."+save);
	// }

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(YamlSpringBootApplication.class, args);
		VaultConfig vaultConfigu=context.getBean(VaultConfig.class); 
		
		
		// User user=new User();
		// user.setEmail(vaultConfig.getEmail());
		// user.setId(vaultConfig.getId());
		// user.setUsername(vaultConfig.getUsername());
		// user.setPassword(vaultConfig.getPassword());
		// user.setRol(vaultConfig.getRol());
		// user.setEnabled(vaultConfig.getEnabled());
		log.info("Username:  "+vaultConfigu.getUsername());
		log.info("Password:  "+vaultConfigu.getPassword());
		// //User user2=userRepository.save(user);
		// System.out.println("User Created Right now..."+user);
		System.out.println("App is Runnig.....................................");
	}

	// @Override
	// public void run(String... args) throws Exception 
	// {
	// 	VaultConfigu vaultConfigu=new VaultConfigu();
		
		
	// 	createUsers(vaultConfigu);
	// }



}
