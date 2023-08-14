package Ambula.com.example.demo.DTOs;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class UserLocationUpdateRequestDto {
    int id;
    String Name;

    double Latitude;

    double Longitude;

    boolean excluded;
}
