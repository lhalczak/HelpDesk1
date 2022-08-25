package pl.halczak.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StatusConverter implements Converter<String, Status> {

    @Autowired
    private StatusService statusService;

    @Override
    public Status convert(String s) {
        return statusService.getStatusById(Long.parseLong(s));
    }
}
