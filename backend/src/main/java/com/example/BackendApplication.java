package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.models.EmployeeDTO;
import com.example.repositories.EmployeeRepository;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.empRepo.save(new EmployeeDTO(1, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(2, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(3, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(4, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(5, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(6, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(7, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(8, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(9, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(10, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(11, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(12, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(13, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(14, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(15, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(16, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(17, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(18, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(19, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(20, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(21, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(22, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(23, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(24, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(25, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(26, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(27, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(28, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(29, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(30, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(31, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(32, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(33, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(34, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(35, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(36, "David", "hiimdavid@fram.com", "Director of David"));
        this.empRepo.save(new EmployeeDTO(37, "John", "johnfram@fram.com", "Head of Johns"));
        this.empRepo.save(new EmployeeDTO(38, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        this.empRepo.save(new EmployeeDTO(39, "David", "hiimdavid@fram.com", "Director of David"));
	}

}
