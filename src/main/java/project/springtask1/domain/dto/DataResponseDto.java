package project.springtask1.domain.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DataResponseDto {

    Long stationGroupId;
    String serialNumber;
    LocalDateTime createdAt;

}
