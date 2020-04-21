package payment.controller;

import com.ghd.payment.module.Response;
import com.ghd.payment.utils.NewResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gehuadong@163.com
 * @date 2020-03-07 23:05
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/get-by-consul")
    public Response getByConsul() {
        log.info("invoke get by consule");
        return NewResponseUtil.makeSuccess("consul");
    }
}
