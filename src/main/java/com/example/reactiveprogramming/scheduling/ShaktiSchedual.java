package com.example.reactiveprogramming.scheduling;

import java.text.SimpleDateFormat;
// import java.util.Date;
import java.util.logging.Logger;

import org.mapstruct.control.MappingControl.Use;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.reactiveprogramming.model.Student;
import com.example.reactiveprogramming.repository.ReactiveUser;

@Component
public class ShaktiSchedual {
    private final Logger log = Logger.getLogger(ShaktiSchedual.class.getName());
	private final SimpleDateFormat dateFormat= new SimpleDateFormat("HH:mm:ss");

    private final ReactiveUser reactiveUser;

    public ShaktiSchedual(ReactiveUser reactiveUser) {
        this.reactiveUser = reactiveUser;
    }
    
   @Scheduled(fixedRate = 5000)
 public void saveUser() {
    Student student = new Student();
    student.setName("shakti");
    student.setEmail("shakti@gmail.com");
    student.setAge(12);
    student.setPassword("hlo");
    reactiveUser.save(student).subscribe(s -> 
        log.info("Updated student: " + s.getId())
    );
}

}
