package Ambula.com.example.demo.DTOs;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UserLocationRequestDto {
    String Name;

    double Latitude;

    double Longitude;

    boolean excluded;


}
