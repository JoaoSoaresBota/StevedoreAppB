package com.Stevedores.Stevedores.Controller;

import com.Stevedores.Stevedores.Model.PortServiceOrder.PortServiceOrder;

public interface UpdateServiceOrder {
    public ReplyMessage postCreateOrder (PortServiceOrder orderRequest, String changeRequesterUuid, String changeReason);
    public ReplyMessage postCancelOrder(String orderUuid, String changeRequestUuid, String changeReason);
    public ReplyMessage postConfirmOrder (String orderUuid, String changeRequesterUuid, String changeReason);
    public ReplyMessage postPlaceExternalOrder(String orderUuid, String changeRequesterUuid, String ChangeReason);
    public ReplyMessage postAddSubOrder (String parentOrderUuid, String childOrderUuid, String changeOrderUuid, String changeReason);
    public ReplyMessage postRemoveSubOrder(String parentOrderUuid, String childOrderUuid, String changeRequesterUuid, String changeReason);
    public ReplyMessage postOrderChangeRequest (PortServiceOrder changeRequest, String changeRequesterUuid, String changeReason);
    public ReplyMessage  postAcceptOrderChangeRequest(String changeRequestUuid, String responseDescription);
    public ReplyMessage postRejectChangeRequest(String changeRequestUuid, String responseDescription);




}


