package Ambula.com.example.demo.DTOs.ResponseDtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UserLocationUpdateResponseDto {
    String Location;

    double Latitude;

    double Longitude;

}
