package com.lastsys.hexagonal.occ_clone.domain.ports.in.record;

import com.lastsys.hexagonal.occ_clone.domain.models.Record;

public interface CreateRecordUseCase {
    Record createRecord(Record record);
}
