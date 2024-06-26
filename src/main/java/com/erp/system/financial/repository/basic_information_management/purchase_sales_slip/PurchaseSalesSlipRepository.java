package com.erp.system.financial.repository.basic_information_management.purchase_sales_slip;

import com.erp.system.common.generic_repository.GenericRepository;
import com.erp.system.financial.model.basic_information_management.purchase_sales_slip.PurchaseSalesSlip;

import java.util.List;

/**
 * 매입매출전표 엔티티에 대한 리포지토리 인터페이스.
 */
public interface PurchaseSalesSlipRepository extends GenericRepository<PurchaseSalesSlip> {
    @Override
    void save(PurchaseSalesSlip entity);

    @Override
    List<PurchaseSalesSlip> findAll();
}