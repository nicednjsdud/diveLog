package com.fastcampus.springrunner.divelog.web.divelog;

import java.util.List;
import com.fastcampus.springrunner.divelog.core.diveresort.application.DiveResortEditor;
import com.fastcampus.springrunner.divelog.core.diveresort.application.DiveResortFinder;
import com.fastcampus.springrunner.divelog.core.diveresort.application.dto.DiveResortDto;
import com.fastcampus.springrunner.divelog.core.diveresort.domain.DiveResort;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class DiveLogRestController {

    private final DiveResortFinder diveResortFinder;
    private final DiveResortEditor diveResortEditor;

    @GetMapping("/dive-resorts")
    public ResponseEntity<List<DiveResort>> findAll(){
        return ResponseEntity.ok(diveResortFinder.findAll());
    }
}
