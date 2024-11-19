package com.web.taller1.services;

import com.web.taller1.dto.ContratoDTO;
import com.web.taller1.model.Contrato;
import com.web.taller1.repository.ContratoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContratoService {

    @Autowired
    private ContratoRepository contratoRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ContratoDTO crearContrato(ContratoDTO contratoDTO) {
        Contrato contrato = modelMapper.map(contratoDTO, Contrato.class);
        Contrato guardado = contratoRepository.save(contrato);
        return modelMapper.map(guardado, ContratoDTO.class);
    }

    public ContratoDTO actualizarContrato(Long id, ContratoDTO contratoDTO) {
        Contrato contrato = contratoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contrato no encontrado"));

        modelMapper.map(contratoDTO, contrato);
        Contrato actualizado = contratoRepository.save(contrato);
        return modelMapper.map(actualizado, ContratoDTO.class);
    }

    public void eliminarContrato(Long id) {
        contratoRepository.deleteById(id);
    }

    public List<ContratoDTO> obtenerTodos() {
        return contratoRepository.findAll()
                .stream()
                .map(c -> modelMapper.map(c, ContratoDTO.class))
                .collect(Collectors.toList());
    }

    public ContratoDTO obtenerPorId(Long id) {
        Contrato contrato = contratoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contrato no encontrado"));
        return modelMapper.map(contrato, ContratoDTO.class);
    }
}
