package com.lastsys.hexagonal.occ_clone.application.usecases.record;

import com.lastsys.hexagonal.occ_clone.domain.models.Record;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.record.RetrieveRecordUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.record.RecordRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveRecordUseCaseImp implements RetrieveRecordUseCase {
    private final RecordRepositoryPort recordRepositoryPort;

    public RetrieveRecordUseCaseImp(RecordRepositoryPort recordRepositoryPort){
        this.recordRepositoryPort = recordRepositoryPort;
    }
    @Override
    public Optional<Record> getRecord(Long id) {
        return recordRepositoryPort.findById(id);
    }

    @Override
    public List<Record> getAllRecord() {
        return recordRepositoryPort.findAll();
    }
}
