package com.example.busmap.Controller;

import com.example.busmap.Config.PaymentConfig;
import com.example.busmap.DTO.PaymentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller

public class PaymentController {
    @RequestMapping( "Payment")
    public String Payment() {
        return "Payment";
    }
//    @PostMapping("create-Payment")
//    public ResponseEntity<?> createPayment(
//            @RequestBody PaymentDTO requestParams) throws IOException {
////        Custommer custommer = (Custommer) this.Se
////        int amount = requestParams.getAmount() * 100;
//        Map<String,String> vnp_Params = new HashMap<>();
//        vnp_Params.put("vnp_Version", PaymentConfig.VERSIONVNPAY);
//        vnp_Params.put("vnp_Command", PaymentConfig.COMMAND);
//        vnp_Params.put("vnp_Tmncode", PaymentConfig.TMVCODE);
////        vnp_Params.put("vnp_Amount", String.valueOf(amount));
//        vnp_Params.put("vnp_Currcode", PaymentConfig.CURRCODE);
////        vnp_Params.put("vnp_Bankcode", requestParams.getBankCode());
////        vnp_Params.put("vnp_TxnRef", String.valueOf(amount));
////        vnp_Params.put("vnp_Orderinfo", requestParams.getDecreption());
//        vnp_Params.put("vnp_OrderType", PaymentConfig.ORDERTYPE);
//        vnp_Params.put("vnp_Locale", PaymentConfig.LOCALEDEFAULT);
//        vnp_Params.put("vnp_Returnurl", PaymentConfig.RETURNURL);
//        vnp_Params.put("vnp_Ipadrr", PaymentConfig.IPDEFAULT);
//    }
}
