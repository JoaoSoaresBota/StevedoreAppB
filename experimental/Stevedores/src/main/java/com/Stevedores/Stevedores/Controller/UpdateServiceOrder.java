package com.Stevedores.Stevedores.Controller;

import com.Stevedores.Stevedores.Controller.Interfaces.IUpdateServiceOrder;
import com.Stevedores.Stevedores.Model.PortServiceOrder;
import com.Stevedores.Stevedores.Model.ReplyMessage;

public class UpdateServiceOrder implements IUpdateServiceOrder {
    @Override
    public ReplyMessage postCreateOrder(PortServiceOrder orderRequest, String changeRequesterUuid, String changeReason) {
        return null;
    }

    @Override
    public ReplyMessage postCancelOrder(String orderUuid, String changeRequestUuid, String changeReason) {
        return null;
    }

    @Override
    public ReplyMessage postConfirmOrder(String orderUuid, String changeRequesterUuid, String changeReason) {
        return null;
    }

    @Override
    public ReplyMessage postPlaceExternalOrder(String orderUuid, String changeRequesterUuid, String ChangeReason) {
        return null;
    }

    @Override
    public ReplyMessage postAddSubOrder(String parentOrderUuid, String childOrderUuid, String changeOrderUuid, String changeReason) {
        return null;
    }

    @Override
    public ReplyMessage postRemoveSubOrder(String parentOrderUuid, String childOrderUuid, String changeRequesterUuid, String changeReason) {
        return null;
    }

    @Override
    public ReplyMessage postOrderChangeRequest(PortServiceOrder changeRequest, String changeRequesterUuid, String changeReason) {
        return null;
    }

    @Override
    public ReplyMessage postAcceptOrderChangeRequest(String changeRequestUuid, String responseDescription) {
        return null;
    }

    @Override
    public ReplyMessage postRejectChangeRequest(String changeRequestUuid, String responseDescription) {
        return null;
    }
}
