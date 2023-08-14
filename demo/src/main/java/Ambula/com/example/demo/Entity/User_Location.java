package Ambula.com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_location")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class User_Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    double Latitude;

    double Longitude;

    boolean excluded;

}
