package Ambula.com.example.demo.Service.ServiceImpl;

import Ambula.com.example.demo.DTOs.ResponseDtos.UserLocationUpdateResponseDto;
import Ambula.com.example.demo.DTOs.UserLocationRequestDto;
import Ambula.com.example.demo.DTOs.UserLocationUpdateRequestDto;
import Ambula.com.example.demo.Entity.User_Location;
import Ambula.com.example.demo.Repository.UserLocationRepository;
import Ambula.com.example.demo.Service.ServiceInterface.UserLocationInterface;
import Ambula.com.example.demo.Transformer.UserLocationTransformer;
import Ambula.com.example.demo.Transformer.UserLocationUpdateTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserLocationServiceImpl implements UserLocationInterface {

    @Autowired
    UserLocationRepository userLocationRepository;
    @Override
    public String createData(UserLocationRequestDto userLocationRequestDto) {

        User_Location user_location= UserLocationTransformer.userLocationRequestToUserLocation(userLocationRequestDto);
        userLocationRepository.save(user_location);
        return "The Data created";
    }

    @Override
    public UserLocationUpdateResponseDto updateLocation(UserLocationUpdateRequestDto userLocationUpdateRequestDto) throws Exception {

        User_Location user_location=userLocationRepository.findById(userLocationUpdateRequestDto.getId()).get();
        if(user_location==null){
            throw new Exception("User Location not found");
        }

        if(userLocationUpdateRequestDto.getLatitude()<0|| userLocationUpdateRequestDto.getLatitude()<0||userLocationUpdateRequestDto.getName()==null){
            throw new Exception("Please provide proper details");
        }

        User_Location user_location1= UserLocationUpdateTransformer.userLocationUpdateResponseDtoToUser_Location( userLocationUpdateRequestDto);
        return UserLocationUpdateTransformer.userLocationToUserLocationUpdateResponseDto(user_location1);

    }

    @Override
    public List<User_Location> findNearestUser(int n) {


        Pageable pageable = PageRequest.of(0, n);
         List<User_Location> userLocationsList=userLocationRepository.findAllByExcludedFalseOrderByDistanceAsc(pageable, 0.0, 0.0);
        return userLocationsList;
    }
}
