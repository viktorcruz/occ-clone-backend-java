package com.lastsys.hexagonal.occ_clone.application.usecases.record;

import com.lastsys.hexagonal.occ_clone.domain.models.Record;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.record.CreateRecordUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.record.RecordRepositoryPort;

public class CreateRecordUseCaseImp implements CreateRecordUseCase {
    private final RecordRepositoryPort recordRepositoryPort;

    public CreateRecordUseCaseImp(RecordRepositoryPort recordRepositoryPort){
        this.recordRepositoryPort = recordRepositoryPort;
    }

    @Override
    public Record createRecord(Record record) {
        return recordRepositoryPort.save(record);
    }
}
