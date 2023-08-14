package Ambula.com.example.demo.Controllers;

import Ambula.com.example.demo.Entity.User_Location;
import Ambula.com.example.demo.Service.ServiceInterface.UserLocationInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
public class ReaderController {

    @Autowired
    UserLocationInterface userLocationInterface;
    @GetMapping("/get_users/{N}")
    public ResponseEntity<List<User_Location>> getUsers(@PathVariable int N) {

        List<User_Location> nearestUsers =userLocationInterface.findNearestUser(N);
        return ResponseEntity.ok(nearestUsers);
    }


}
