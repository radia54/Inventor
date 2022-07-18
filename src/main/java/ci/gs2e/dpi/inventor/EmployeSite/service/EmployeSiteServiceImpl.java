package ci.gs2e.dpi.inventor.EmployeSite.service;

import ci.gs2e.dpi.inventor.EmployeSite.domain.EmployeSite;
import ci.gs2e.dpi.inventor.EmployeSite.domain.dto.EmployeSiteDto;
import ci.gs2e.dpi.inventor.EmployeSite.mapper.EmployeSiteMapper;
import ci.gs2e.dpi.inventor.EmployeSite.repository.EmployeSiteRepository;
import ci.gs2e.dpi.inventor.employe.mapper.EmployeMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class EmployeSiteServiceImpl implements EmployeSiteService{
    EmployeSiteRepository employeSiteRepository;

    @Override
    public List<EmployeSiteDto> getAll() {
        return EmployeSiteMapper.INSTANCE.fromEmployeSiteList(employeSiteRepository.findAll());
    }

    @Override
    public EmployeSiteDto create(EmployeSiteDto employeSiteDto) {
        return EmployeSiteMapper.INSTANCE.fromEmployeSite(employeSiteRepository.save(EmployeSiteMapper.INSTANCE.fromEmployeSiteDto(employeSiteDto)));
    }

    @Override
    public EmployeSite getById(long id) {
        return employeSiteRepository.findById(id).get();
    }

    @Override
    public EmployeSiteDto update(EmployeSiteDto employeSiteDto, long id) {
        EmployeSiteDto site = EmployeSiteMapper.INSTANCE.fromEmployeSite(employeSiteRepository.findById(id).get());
        if (Objects.nonNull(employeSiteDto.getLocalisation_site())){
            site.setLocalisation_site(site.getLocalisation_site());

        }
        if (Objects.nonNull(employeSiteDto.getLocalisation_complete_site())){
            site.setLocalisation_complete_site(employeSiteDto.getLocalisation_complete_site());
        }
        if (Objects.nonNull(employeSiteDto.getEntreprise())){
            site.setEntreprise(employeSiteDto.getEntreprise());
        }
        return EmployeSiteMapper.INSTANCE.fromEmployeSite(employeSiteRepository.save(EmployeSiteMapper.INSTANCE.fromEmployeSiteDto(site)));
    }

    @Override
    public void delete(long id) {
        employeSiteRepository.deleteById(id);

    }
/*
    @Override
    public EmployeSite getByName(String name) {
        return employeSiteRepository.findByLocalisation_site(name).get();
    }
    */

}
