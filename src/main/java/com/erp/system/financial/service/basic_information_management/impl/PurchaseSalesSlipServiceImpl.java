package com.erp.system.financial.service.basic_information_management.impl;

import com.erp.system.common.annotation.Component;
import com.erp.system.financial.repository.basic_information_management.purchase_sales_slip.EntryRepository;
import com.erp.system.financial.repository.basic_information_management.purchase_sales_slip.PurchaseSalesSlipRepository;
import com.erp.system.financial.repository.basic_information_management.purchase_sales_slip.VatTypeRepository;
import com.erp.system.financial.service.basic_information_management.PurchaseSalesSlipService;

@Component
public class PurchaseSalesSlipServiceImpl implements PurchaseSalesSlipService {
    private static volatile PurchaseSalesSlipServiceImpl instance; // 싱글톤 인스턴스를 저장할 변수
    private final EntryRepository entriesRepository;
    private final PurchaseSalesSlipRepository purchaseSalesSlipRepository;
    private final VatTypeRepository vatTypesRepository;

    public PurchaseSalesSlipServiceImpl(EntryRepository entriesRepository,
                                        PurchaseSalesSlipRepository purchaseSalesSlipRepository,
                                        VatTypeRepository vatTypesRepository) {
        this.entriesRepository = entriesRepository;
        this.purchaseSalesSlipRepository = purchaseSalesSlipRepository;
        this.vatTypesRepository = vatTypesRepository;
    }
}