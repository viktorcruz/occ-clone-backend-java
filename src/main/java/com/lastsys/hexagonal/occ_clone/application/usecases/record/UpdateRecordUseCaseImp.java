package com.lastsys.hexagonal.occ_clone.application.usecases.record;

import com.lastsys.hexagonal.occ_clone.domain.models.Record;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.record.UpdateRecordUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.record.RecordRepositoryPort;

import java.util.Optional;

public class UpdateRecordUseCaseImp implements UpdateRecordUseCase {
    private final RecordRepositoryPort recordRepositoryPort;

    public UpdateRecordUseCaseImp(RecordRepositoryPort recordRepositoryPort){
        this.recordRepositoryPort = recordRepositoryPort;
    }

    @Override
    public Optional<Record> updateRecord(Long id, Record record) {
        return recordRepositoryPort.update(record);
    }
}
