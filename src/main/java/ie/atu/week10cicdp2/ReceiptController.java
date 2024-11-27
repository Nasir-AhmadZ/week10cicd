package ie.atu.week10cicdp2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/receipt")
@RestController

public class ReceiptController {

    @PostMapping
    private String makeReceipt(@RequestBody Person person)
    {
        return "Got person details" + person;
    }
}
