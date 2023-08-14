package Ambula.com.example.demo.Transformer;

import Ambula.com.example.demo.DTOs.UserLocationRequestDto;
import Ambula.com.example.demo.Entity.User_Location;
import Ambula.com.example.demo.Repository.UserLocationRepository;

public class UserLocationTransformer {

    public static User_Location userLocationRequestToUserLocation(UserLocationRequestDto userLocationRequestDto){
        User_Location user_location=new User_Location();
        user_location.builder().excluded(userLocationRequestDto.isExcluded()).Latitude(userLocationRequestDto.getLatitude())
                .name(userLocationRequestDto.getName())
                .Longitude(userLocationRequestDto.getLongitude()).build();
        return user_location;
    }
}
