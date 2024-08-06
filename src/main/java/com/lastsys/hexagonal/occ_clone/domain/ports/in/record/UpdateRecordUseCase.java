package com.lastsys.hexagonal.occ_clone.domain.ports.in.record;

import com.lastsys.hexagonal.occ_clone.domain.models.Record;

import java.util.Optional;

public interface UpdateRecordUseCase {
    Optional<Record> updateRecord(Long id, Record record);
}
