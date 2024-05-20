package project.springtask1.domain.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.springtask1.domain.dto.DataRequestDto;
import project.springtask1.domain.dto.DataResponseDto;
import project.springtask1.domain.service.DataService;
import project.springtask1.global.ResponseDto;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1")
public class DataController {

    private final DataService dataService;

    @PostMapping("/data")
    public ResponseEntity<ResponseDto<DataResponseDto>> collectData(@Valid @RequestBody DataRequestDto dataRequestDto){
        DataResponseDto data =  dataService.collectData(dataRequestDto);
        return ResponseDto.ok("success", data);
    }




}
