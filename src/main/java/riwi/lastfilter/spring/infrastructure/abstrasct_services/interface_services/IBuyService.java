package riwi.lastfilter.spring.infrastructure.abstrasct_services.interface_services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import riwi.lastfilter.spring.domain.entities.Buy;
import riwi.lastfilter.spring.infrastructure.abstrasct_services.IFindAll;

public interface IBuyService extends IFindAll<PageRequest, Page<Buy>>{
}