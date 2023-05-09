package com.tobi.Springbootclassdemo.Controller;


import com.tobi.Springbootclassdemo.DTO.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {
    /*
    Get Request
    Put Request
    Post Request
     */
    @GetMapping("/greetings")
    public String greetings(){
        return "Hello guys its a Beautiful Day";
    }

    @GetMapping("/welcome")
    public String welcome(){

        return "You're Logged In Successfully";
    }


//    @PostMapping("/request")
//    public String logins(@RequestBody LoginRequest request){
//        if (request.getPassword().equalsIgnoreCase("password") &&
//                request.getUserName().equalsIgnoreCase("iacademy")){
//            return "You are logged in";
//        }else {
//            return "Wrong username and password";
//        }

        @PostMapping
        public ResponseEntity<String> login(@RequestBody LoginRequest request){
            String message = "You are logged in";
            if (request.getPassword().equalsIgnoreCase("password") &&
                    request.getUserName().equalsIgnoreCase("iacademy")){
                return ResponseEntity.ok(message) ;
            }else {

                return ResponseEntity.badRequest().body("Wrong username and password");
            }
        }








    }


