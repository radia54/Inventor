package ci.gs2e.dpi.inventor.employe.service;

import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.employe.domain.dto.EmployeDto;
import ci.gs2e.dpi.inventor.employe.mapper.EmployeMapper;
import ci.gs2e.dpi.inventor.employe.repository.EmployeRepository;
import ci.gs2e.dpi.inventor.magasin.mapper.MagasinMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class EmployeServiceImpl implements EmployeService{

    EmployeRepository employeRepository;
    @Override
    public List<EmployeDto> getAll() {
        return EmployeMapper.INSTANCE.fromEmployeList(employeRepository.findAll());
    }

    @Override
    public EmployeDto create(EmployeDto employe) {
        return EmployeMapper.INSTANCE.fromEmploye(employeRepository.save(EmployeMapper.INSTANCE.fromEmployeDto(employe)));
    }

    @Override
    public Employe getById(long id) {
        return employeRepository.findById(id).get();
    }

    @Override
    public Employe getByName(String name) {
        return employeRepository.findByMatricule(name).get();
    }

    @Override
    public void delete(long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public EmployeDto update(EmployeDto employeDto, long id) {
        EmployeDto employeDto1= EmployeMapper.INSTANCE.fromEmploye(employeRepository.findById(id).get());

        if (Objects.nonNull(employeDto.getMatricule())){
            employeDto1.setMatricule(employeDto.getMatricule());
        }
        if (Objects.nonNull(employeDto.getNom())){
            employeDto1.setNom(employeDto.getNom());
        }
        if (Objects.nonNull(employeDto.getPrenom())){
            employeDto1.setPrenom(employeDto.getPrenom());
        }
        if (Objects.nonNull(employeDto.getEmployeSite())){
            employeDto1.setEmployeSite(employeDto.getEmployeSite());
        }
        return EmployeMapper.INSTANCE.fromEmploye(employeRepository.save(EmployeMapper.INSTANCE.fromEmployeDto(employeDto1)));
    }
}
