package io.github.bishion.demo.swagger;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class BookOrderService extends AbstractOrderService {
    @Resource
    private BookOrderMapper bookOrderMapper;

    @Override
    @Transactional
    public void saveExtendData(String data) {
        //
    }
}
