package project.springtask1.domain.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import project.springtask1.domain.dto.DataRequestDto;
import project.springtask1.domain.dto.DataResponseDto;
import project.springtask1.domain.entity.Data;
import project.springtask1.domain.repository.DataRepository;

@Service
@RequiredArgsConstructor
public class DataService {

    private final DataRepository dataRepository;

    @Transactional
    public DataResponseDto collectData(DataRequestDto dataRequestDto) {

        Data dataEntity =  new Data(dataRequestDto.getStationGroupSerial());

        dataRepository.save(dataEntity);

        return new DataResponseDto(dataEntity.getStationGroupId(), dataRequestDto.getStationGroupSerial(), dataEntity.getCreatedAt());
    }
}
