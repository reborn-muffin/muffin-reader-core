package com.maffin.maffin_backend.Controllers;

import com.maffin.maffin_backend.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:3000/")
public class AuthController {
    @PostMapping("/login")
    boolean login(@RequestBody UserDTO user){
        System.out.println(String.format("%s: %s", user.getName(), user.getPassword()));
        return true;
    }
}
