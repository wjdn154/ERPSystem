package com.erp.system.financial.repository.basic_information_management.company_registration;

import com.erp.system.common.generic_repository.GenericRepository;
import com.erp.system.financial.model.basic_information_management.company_registration.Company;
import com.erp.system.financial.model.basic_information_management.company_registration.Contact;

import java.util.List;

/**
 * 연락처 정보 엔티티에 대한 리포지토리 인터페이스.
 */
public interface ContactRepository extends GenericRepository<Contact> {
    @Override
    void save(Contact entity);

    @Override
    List<Contact> findAll();
}