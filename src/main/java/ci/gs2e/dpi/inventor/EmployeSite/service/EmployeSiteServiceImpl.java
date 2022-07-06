package ci.gs2e.dpi.inventor.EmployeSite.service;

import ci.gs2e.dpi.inventor.EmployeSite.domain.EmployeSite;
import ci.gs2e.dpi.inventor.EmployeSite.domain.dto.EmployeSiteDto;
import ci.gs2e.dpi.inventor.EmployeSite.mapper.EmployeSiteMapper;
import ci.gs2e.dpi.inventor.EmployeSite.repository.EmployeSiteRepository;
import ci.gs2e.dpi.inventor.employe.mapper.EmployeMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeSiteServiceImpl implements EmployeSiteService{
    EmployeSiteRepository employeSiteRepository;

    @Override
    public List<EmployeSiteDto> getAll() {
        return EmployeSiteMapper.INSTANCE.fromEmployeSiteList(employeSiteRepository.findAll());
    }

    @Override
    public EmployeSiteDto create(EmployeSiteDto employeSiteDto) {
        return EmployeSiteMapper.INSTANCE.fromEmployeSite(employeSiteRepository.save(EmployeSiteMapper.INSTANCE.fromEmployeDto(employeSiteDto)));
    }

    @Override
    public EmployeSite getById(long id) {
        return employeSiteRepository.findById(id).get();
    }
/*
    @Override
    public EmployeSite getByName(String name) {
        return employeSiteRepository.findByLocalisation_site(name).get();
    }
    */

}
