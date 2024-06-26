package com.erp.system.financial.repository.basic_information_management.company_registration;

import com.erp.system.common.generic_repository.GenericRepository;
import com.erp.system.financial.model.basic_information_management.company_registration.Contact;
import com.erp.system.financial.model.basic_information_management.company_registration.CorporateKind;

import java.util.List;

/**
 * 법인종류 엔티티에 대한 리포지토리 인터페이스.
 */
public interface CorporateKindRepository extends GenericRepository<CorporateKind> {
    @Override
    void save(CorporateKind entity);

    @Override
    List<CorporateKind> findAll();
}