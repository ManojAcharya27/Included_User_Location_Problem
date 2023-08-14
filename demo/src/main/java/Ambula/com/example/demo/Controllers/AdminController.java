package Ambula.com.example.demo.Controllers;

import Ambula.com.example.demo.DTOs.ResponseDtos.UserLocationUpdateResponseDto;
import Ambula.com.example.demo.DTOs.UserLocationRequestDto;
import Ambula.com.example.demo.DTOs.UserLocationUpdateRequestDto;
import Ambula.com.example.demo.Service.ServiceInterface.UserLocationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UserLocationInterface userLocationInterface;
    @PostMapping("/create_data")
    ResponseEntity<String> createData(@RequestBody UserLocationRequestDto userLocationRequestDto){
        userLocationInterface.createData(userLocationRequestDto);
        return new ResponseEntity<>("Data has been created", HttpStatus.CREATED);
    }

    @PutMapping ("/update_data")
    ResponseEntity updateData(@RequestBody UserLocationUpdateRequestDto userLocationUpdateRequestDto){

        try {
            UserLocationUpdateResponseDto userLocationUpdateResponseDto=userLocationInterface.updateLocation(userLocationUpdateRequestDto);
            return new ResponseEntity<>(userLocationUpdateResponseDto,HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.CREATED);
        }
    }



}
