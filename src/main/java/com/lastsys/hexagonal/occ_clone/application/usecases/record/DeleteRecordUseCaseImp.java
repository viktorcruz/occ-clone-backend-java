package com.lastsys.hexagonal.occ_clone.application.usecases.record;


import com.lastsys.hexagonal.occ_clone.domain.ports.in.record.DeleteRecordUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.record.RecordRepositoryPort;

public class DeleteRecordUseCaseImp implements DeleteRecordUseCase {
    private RecordRepositoryPort recordRepositoryPort;

    public DeleteRecordUseCaseImp(RecordRepositoryPort recordRepositoryPort){
        this.recordRepositoryPort = recordRepositoryPort;
    }

    @Override
    public boolean deleteRecord(Long id) {
        return recordRepositoryPort.deleteById(id);
    }
}
