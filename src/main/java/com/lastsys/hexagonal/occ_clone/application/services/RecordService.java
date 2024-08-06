package com.lastsys.hexagonal.occ_clone.application.services;

import com.lastsys.hexagonal.occ_clone.domain.models.Record;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.record.CreateRecordUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.record.DeleteRecordUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.record.RetrieveRecordUseCase;
import com.lastsys.hexagonal.occ_clone.domain.ports.in.record.UpdateRecordUseCase;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecordService implements CreateRecordUseCase, DeleteRecordUseCase, RetrieveRecordUseCase, UpdateRecordUseCase {
    private final CreateRecordUseCase createRecordUseCase;
    private final DeleteRecordUseCase deleteRecordUseCase;
    private final RetrieveRecordUseCase retrieveRecordUseCase;
    private final UpdateRecordUseCase updateRecordUseCase;

    public RecordService(
        CreateRecordUseCase createRecordUseCase,
        DeleteRecordUseCase deleteRecordUseCase,
        RetrieveRecordUseCase retrieveRecordUseCase,
        UpdateRecordUseCase updateRecordUseCase
    ){
        this.createRecordUseCase = createRecordUseCase;
        this.deleteRecordUseCase = deleteRecordUseCase;
        this.retrieveRecordUseCase = retrieveRecordUseCase;
        this.updateRecordUseCase = updateRecordUseCase;
    }

    @Override
    public Record createRecord(Record record) {
        return createRecordUseCase.createRecord(record);
    }

    @Override
    public boolean deleteRecord(Long id) {
        return deleteRecordUseCase.deleteRecord(id);
    }

    @Override
    public Optional<Record> getRecord(Long id) {
        return retrieveRecordUseCase.getRecord(id);
    }

    @Override
    public List<Record> getAllRecord() {
        return retrieveRecordUseCase.getAllRecord();
    }

    @Override
    public Optional<Record> updateRecord(Long id, Record record) {
        return updateRecordUseCase.updateRecord(id, record);
    }
}
