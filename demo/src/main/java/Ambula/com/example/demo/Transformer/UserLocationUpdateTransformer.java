package Ambula.com.example.demo.Transformer;

import Ambula.com.example.demo.DTOs.ResponseDtos.UserLocationUpdateResponseDto;
import Ambula.com.example.demo.DTOs.UserLocationUpdateRequestDto;
import Ambula.com.example.demo.Entity.User_Location;

public class UserLocationUpdateTransformer {

    public  static User_Location userLocationUpdateResponseDtoToUser_Location(UserLocationUpdateRequestDto userLocationUpdateRequestDto){
        User_Location user_location=new User_Location();
        user_location.builder().Longitude(userLocationUpdateRequestDto.getLongitude()).name(userLocationUpdateRequestDto.getName())
                .Latitude(user_location.getLatitude()).id(user_location.getId()).excluded(userLocationUpdateRequestDto.isExcluded()).build();
        return user_location;


    }

    public  static UserLocationUpdateResponseDto userLocationToUserLocationUpdateResponseDto(User_Location user_location){

        UserLocationUpdateResponseDto userLocationUpdateResponseDto=new UserLocationUpdateResponseDto();
        userLocationUpdateResponseDto.builder().Location(user_location.getName()).Latitude(user_location.getLatitude())
                .Longitude(user_location.getLongitude()).build();
        return userLocationUpdateResponseDto;
    }
}
