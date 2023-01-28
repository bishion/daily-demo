package io.github.bishion.demo01.cglib;

import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

public abstract class AbstractOrderService {
    @Resource
    private TransactionTemplate transactionTemplate;

    public abstract void saveExtendData(String data);

    public final void createOrderWithFinal(String data) {
        transactionTemplate.execute(status -> {
            try {
                // 保存通用订单信息
                // 保存扩展信息
                saveExtendData(data);
            } catch (Exception e) {
                status.setRollbackOnly();
            }
            return null;
        });


    }

    public void createOrderNoFinal(String data) {
        transactionTemplate.execute(status -> {
            try {
                // 保存通用订单信息
                // 保存扩展信息
                saveExtendData(data);
            } catch (Exception e) {
                status.setRollbackOnly();
            }
            return null;
        });


    }
}
