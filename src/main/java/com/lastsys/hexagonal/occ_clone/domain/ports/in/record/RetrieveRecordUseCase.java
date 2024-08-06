package com.lastsys.hexagonal.occ_clone.domain.ports.in.record;

import com.lastsys.hexagonal.occ_clone.domain.models.Record;

import java.util.Optional;
import java.util.List;

public interface RetrieveRecordUseCase {
    Optional<Record> getRecord(Long id);
    List<Record> getAllRecord();
}
