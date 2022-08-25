package pl.halczak.status;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class StatusService {

    private final StatusRepository statusRepository;

    public Status getStatusById(long id) { return statusRepository.getOne(id); }
}
