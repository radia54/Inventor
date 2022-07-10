package ci.gs2e.dpi.inventor.employe.service;

import ci.gs2e.dpi.inventor.employe.domain.Employe;
import ci.gs2e.dpi.inventor.employe.domain.dto.EmployeDto;
import ci.gs2e.dpi.inventor.employe.mapper.EmployeMapper;
import ci.gs2e.dpi.inventor.employe.repository.EmployeRepository;
import ci.gs2e.dpi.inventor.magasin.mapper.MagasinMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
