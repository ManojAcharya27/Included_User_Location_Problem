package Ambula.com.example.demo.Service.ServiceInterface;

import Ambula.com.example.demo.DTOs.ResponseDtos.UserLocationUpdateResponseDto;
import Ambula.com.example.demo.DTOs.UserLocationRequestDto;
import Ambula.com.example.demo.DTOs.UserLocationUpdateRequestDto;
import Ambula.com.example.demo.Entity.User_Location;

import java.awt.print.Pageable;
import java.util.List;

public interface UserLocationInterface {

    public String createData(UserLocationRequestDto userLocationRequestDto);


    public UserLocationUpdateResponseDto updateLocation(UserLocationUpdateRequestDto userLocationUpdateRequestDto) throws Exception;

    public List<User_Location>  findNearestUser(int n);
}
