package com.lastsys.hexagonal.occ_clone.infraestructure.repositories;

import com.lastsys.hexagonal.occ_clone.domain.models.Record;
import com.lastsys.hexagonal.occ_clone.domain.ports.out.record.RecordRepositoryPort;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.RecordEntity;
import com.lastsys.hexagonal.occ_clone.infraestructure.entities.UserEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaRecordRepositoryAdapter implements RecordRepositoryPort {
    private final JpaRecordRepository jpaRecordRepository;
    private final JpaUserRepository jpaUserRepository;

    public JpaRecordRepositoryAdapter(
            JpaRecordRepository jpaRecordRepository,
            JpaUserRepository jpaUserRepository
    ){
        this.jpaRecordRepository = jpaRecordRepository;
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public Record save(Record record) {
        UserEntity userEntity = jpaUserRepository.findById(record.getIdUser())
                .orElseThrow(()-> new RuntimeException("User not found"));
        RecordEntity recordEntity = RecordEntity.fromDomainModel(record, userEntity);
        RecordEntity saveRecordEntity = jpaRecordRepository.save(recordEntity);

        return saveRecordEntity.toDomainModel();
    }

    @Override
    public Optional<Record> findById(Long id) {
        return jpaRecordRepository.findById(id)
                .map(RecordEntity::toDomainModel);
    }

    @Override
    public List<Record> findAll() {
        return jpaRecordRepository.findAll()
                .stream().map(RecordEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Record> update(Record record) {
        if(jpaRecordRepository.existsById(record.getId())){
            UserEntity userEntity = jpaUserRepository.findById(record.getIdUser())
                    .orElseThrow(()-> new RuntimeException("User not found"));
            RecordEntity recordEntity = RecordEntity.fromDomainModel(record, userEntity);
            RecordEntity updateRecordEntity = jpaRecordRepository.save(recordEntity);

            return Optional.of(updateRecordEntity.toDomainModel());
        }

        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaRecordRepository.existsById(id)){
            jpaRecordRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
